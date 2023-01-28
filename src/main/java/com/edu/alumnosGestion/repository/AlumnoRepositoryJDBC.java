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
import com.edu.alumnosGestion.bo.Asignatura;
import com.edu.alumnosGestion.bo.Profesor;

@Repository
public class AlumnoRepositoryJDBC implements AlumnoRepository {
	Logger logger = LoggerFactory.getLogger(AlumnosGestionApplication.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void altaAlumno(Alumno a) {
		final String SQL_INSERT = "INSERT INTO alumno (legajo ,nombre , apellido, edad, activo) VALUES (?,?,?,?,?)";
		logger.info("DANDO DE ALTA UN ALUMNO");
		jdbcTemplate.update(SQL_INSERT, a.getLegajo(), a.getNombre(), a.getApellido(), a.getEdad(), a.isActivo());
		logger.info("ALUMNO DADO DE ALTA");
	}

	@Override
	public List<Alumno> listarAlumnos() {
		final String SQL_SELECT_ALL = "SELECT alumno.legajo, alumno.nombre, alumno.apellido, alumno.edad, alumno.activo, asignatura.idAsignatura, asignatura.descripcion, asignatura.idProfesor FROM alumno LEFT JOIN alumno_asignatura ON alumno.legajo = alumno_asignatura.idAlumno LEFT JOIN asignatura ON alumno_asignatura.idAsignatura = asignatura.idAsignatura ";
		return jdbcTemplate.query(SQL_SELECT_ALL, new RowMapper<Alumno>() {
			@Override
			public Alumno mapRow(ResultSet rs, int rowNum) throws SQLException {
				List<Asignatura> lista = new ArrayList<>();
				lista.add(new Asignatura(rs.getInt("idAsignatura"), new Profesor(rs.getInt("idProfesor")), rs.getString("descripcion")));
				return new Alumno(rs.getInt("legajo"), rs.getString("nombre"), rs.getString("apellido"),
						rs.getInt("edad"), rs.getBoolean("activo"), lista);
			}
		});

	}

	@Override
	public Alumno obtnerPorId(int id) {
		final String SQL_SELECT_BY_ID = "SELECT legajo, nombre, apellido, edad, activo FROM alumno WHERE legajo=?";
		return jdbcTemplate.queryForObject(SQL_SELECT_BY_ID, new RowMapper<Alumno>() {

			@Override
			public Alumno mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Alumno(rs.getInt("legajo"), rs.getString("nombre"), rs.getString("apellido"),
						rs.getInt("edad"), rs.getBoolean("activo"));
			}

		}, id);
	}

	@Override
	public void eliminarAlumno(int legajo) {
		final String SQL_DELETE = "DELETE FROM alumno WHERE legajo=?";
		jdbcTemplate.update(SQL_DELETE, legajo);
	}

	@Override
	public void modificarAlumno(Alumno a, int legajo) {
		final String SQL_UPDATE = "UPDATE alumno SET nombre=?, apellido=?, edad=?, activo=? WHERE legajo=?";
		jdbcTemplate.update(SQL_UPDATE, a.getNombre(), a.getApellido(), a.getEdad(), a.isActivo(), legajo);
	}

}
