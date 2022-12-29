package com.edu.alumnosGestion.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.edu.alumnosGestion.bo.Asignatura;
import com.edu.alumnosGestion.bo.Profesor;

@Repository
public class AsignaturaRepositoryJDBC implements AsignaturaRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void altaAsignatura(Asignatura asignatura) {
		final String SQL_INSERT = "INSERT INTO asignatura(idAsignatura, descripcion, idProfesor) VALUES(?,?,?)";
		jdbcTemplate.update(SQL_INSERT, asignatura.getIdAsignatura(), asignatura.getDescripcion(), asignatura.getIdProfesor());
	}

	@Override
	public List<Asignatura> listarAsignaturas() {
		final String SQL_SELECT_ALL = "SELECT asignatura.idAsignatura, asignatura.descripcion, asignatura.idProfesor, profesor.nombre, profesor.apellido FROM asignatura LEFT JOIN profesor ON profesor.idProfesor=asignatura.idProfesor";
		return jdbcTemplate.query(SQL_SELECT_ALL, new RowMapper<Asignatura>() {

			@Override
			public Asignatura mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Asignatura(rs.getInt("idAsignatura"),
						new Profesor(rs.getInt("idProfesor"), rs.getString("nombre"), rs.getString("apellido")),
						rs.getString("descripcion"));
			}

		});
	}

	@Override
	public Asignatura obtnerPorId(int id) {
		final String SQL_SELECT_BY_ID = "SELECT asignatura.idAsignatura, asignatura.descripcion, profesor.nombre, profesor.apellido FROM asignatura LEFT JOIN profesor ON asignatura.idProfesor=profesor.idProfesor WHERE idAsignatura = ?";

		return jdbcTemplate.queryForObject(SQL_SELECT_BY_ID, new RowMapper<Asignatura>() {

			@Override
			public Asignatura mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Asignatura(rs.getInt("idAsignatura"),
						new Profesor(rs.getInt("idProfesor"), rs.getString("nombre"), rs.getString("apellido")),
						rs.getString("descripcion"));
			}

		}, id);
	}

	@Override
	public void eliminarAsignatura(int id) {
		final String SQL_DELETE = "DELETE FROM asignatura WHERE idAsignatura = ?";
		jdbcTemplate.update(SQL_DELETE,id);
	}

	@Override
	public void modificarAsignatura(Asignatura asignatura, int id) {
		final String SQL_UPDATE = "UPDATE asignatura SET idAsignatura = ?, descripcion = ?, id_Profesor = ? WHERE idAsignatura = ?";
		jdbcTemplate.update(SQL_UPDATE, asignatura.getIdAsignatura(), asignatura.getDescripcion(), asignatura.getIdProfesor(), id);
	}

}
