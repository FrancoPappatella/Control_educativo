package com.edu.alumnosGestion.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.edu.alumnosGestion.bo.Profesor;

@Repository
public class ProfesorRepositoryJDBC implements ProfesorRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void altaProfesor(Profesor profesor) {
		final String SQL_INSERT = "INSERT INTO profesor(idProfesor, nombre, apellido) VALUES(?,?,?)";
		jdbcTemplate.update(SQL_INSERT, profesor.getIdProfesor(), profesor.getNombre(), profesor.getApellido());
	}

	@Override
	public List<Profesor> listarProfesores() {
		final String SQL_SELECT_ALL = "SELECT idProfesor, nombre, apellido FROM profesor";
		return jdbcTemplate.query(SQL_SELECT_ALL, new RowMapper<Profesor>() {

			@Override
			public Profesor mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Profesor(rs.getInt("idProfesor"), rs.getString("nombre"), rs.getString("apellido"));
			}
		});
	}

	@Override
	public Profesor obtnerPorId(int id) {
		final String SQL_SELECT_BY_ID = "SELECT idProfesor, nombre, apellido FROM profesor WHERE id_profesor=?";
		return jdbcTemplate.queryForObject(SQL_SELECT_BY_ID, new RowMapper<Profesor>() {

			@Override
			public Profesor mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Profesor(rs.getInt("idProfesor"), rs.getString("nombre"), rs.getString("apellido"));
			}

		}, id);

	}

	@Override
	public void eliminarProfesor(int id) {
		final String SQL_DELETE = "DELETE FROM profesor WHERE idProfesor=?";
		jdbcTemplate.update(SQL_DELETE, id);
	}

	@Override
	public void modificarProfesor(Profesor profesor, int id) {
		final String SQL_UPDATE = "UPDATE profesor SET nombre=?, apellido=? WHERE idProfesor=?";
		jdbcTemplate.update(SQL_UPDATE, profesor.getNombre(), profesor.getApellido(), id);
	}

}
