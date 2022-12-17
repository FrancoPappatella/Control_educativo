package com.edu.alumnosGestion.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.edu.alumnosGestion.AlumnosGestionApplication;
import com.edu.alumnosGestion.bo.Alumno;

@Repository
public class AlumnoRepositoryJDBC implements AlumnoRepository {
	Logger logger = LoggerFactory.getLogger(AlumnosGestionApplication.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private final String SQL_INSERT = "INSERT INTO alumno (legajo ,nombre , apellido, edad, activo) VALUES (?,?,?,?,?)";
	private final String SQL_SELECT_ALL = "SELECT legajo, nombre, apellido, edad, activo FROM alumno";
	private final String SQL_SELECT_BY_ID = "SELECT legajo, nombre, apellido, edad, activo FROM alumno WHERE legajo=?";
	private final String SQL_DELETE = "DELETE FROM alumno WHERE legajo=?";
	private final String SQL_UPDATE = "UPDATE alumno SET nombre=?, apellido=?, edad=?, activo=? WHERE legajo=?";
	

	@Override
	public void altaAlumno(Alumno a) {
		logger.info("DANDO DE ALTA UN ALUMNO");
		jdbcTemplate.update(SQL_INSERT, a.getLegajo(), a.getNombre(), a.getApellido(), a.getEdad(), a.isActivo());
		logger.info("ALUMNO DADO DE ALTA");	
	}

	@Override
	public List<Alumno> listarAlumnos() {
		return jdbcTemplate.query(SQL_SELECT_ALL, new RowMapper<Alumno>() {
			@Override
			public Alumno mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new Alumno(rs.getInt("legajo"), rs.getString("nombre"), rs.getString("apellido"), rs.getInt("edad"),rs.getBoolean("activo"));
			}
		});
		
	}

	@Override
	public Alumno obtnerPorId(int id) {
		return jdbcTemplate.queryForObject(SQL_SELECT_BY_ID, new RowMapper<Alumno>() {

			@Override
			public Alumno mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Alumno(rs.getInt("legajo"), rs.getString("nombre"), rs.getString("apellido"), rs.getInt("edad"),rs.getBoolean("activo"));
			}
			
		}, id);
	}

	@Override
	public void eliminarAlumno(int legajo) {
		jdbcTemplate.update(SQL_DELETE, legajo);
	}

	@Override
	public void modificarAlumno(Alumno a, int legajo) {
		jdbcTemplate.update(SQL_UPDATE,a.getNombre(),a.getApellido(),a.getEdad(),a.isActivo(),legajo);
	}

}
