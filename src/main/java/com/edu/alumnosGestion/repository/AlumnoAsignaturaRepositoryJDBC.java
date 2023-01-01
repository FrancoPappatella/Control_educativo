package com.edu.alumnosGestion.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.edu.alumnosGestion.bo.Alumno;
import com.edu.alumnosGestion.bo.AlumnoAsignatura;

@Repository
public class AlumnoAsignaturaRepositoryJDBC implements AlumnoAsignaturaRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void inscribirAlumno(int legajo, int idAsignatura) {
		final String SQL_INSERT = "INSERT INTO alumno_asignatura(idAlumno, idAsignatura) VALUES(?,?)";
		jdbcTemplate.update(SQL_INSERT, legajo, idAsignatura);
	}

	@Override
	public List<AlumnoAsignatura> listarInscripciones() {
		final String SQL_SELECT_ALL = "SELECT idAlumno, idAsignatura FROM alumno_asignatura";
		return jdbcTemplate.query(SQL_SELECT_ALL, new RowMapper<AlumnoAsignatura>() {
			@Override
			public AlumnoAsignatura mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new AlumnoAsignatura(rs.getInt("idAlumno"), rs.getInt("idAsignatura"));
			}
		});
	}

	@Override
	public AlumnoAsignatura obtnerPorId(int legajo, int idAsignatura) {
		final String SQL_SELECT_BY_ID = "SELECT idAlumno, idAsignatura FROM alumno_asignatura WHERE idAlumno = ? AND idAsignatura = ?";
		return jdbcTemplate.queryForObject(SQL_SELECT_BY_ID, new RowMapper<AlumnoAsignatura>() {

			@Override
			public AlumnoAsignatura mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new AlumnoAsignatura(rs.getInt("idAlumno"), rs.getInt("idAsignatura"));
			}

		}, legajo, idAsignatura);
	}

	@Override
	public void eliminarAlumno(int legajo) {
		final String SQL_DELETE = "DELETE FROM alumno_asignatura WHERE idAlumno = ?";
		jdbcTemplate.update(SQL_DELETE, legajo);
	}

	@Override
	public void eliminarAsignatura(int idAsignatura) {
		final String SQL_DELETE = "DELETE FROM alumno_asignatura WHERE idAsignatura = ?";
		jdbcTemplate.update(SQL_DELETE, idAsignatura);
	}

	@Override
	public void modificarInscripcion(int legajoNuevo, int legajoViejo, int idAsignaturaNuevo, int idAsignaturaViejo) {
		final String SQL_UPDATE = "UPDATE alumno_asignatura SET idAlumno = ?, idAsignatura = ? WHERE idAlumno = ? AND idAsignatura = ?";
		jdbcTemplate.update(SQL_UPDATE, legajoNuevo, idAsignaturaNuevo, legajoViejo, idAsignaturaViejo);
	}

}
