package com.edu.alumnosGestion.repository;

import java.util.List;

import com.edu.alumnosGestion.bo.Alumno;
import com.edu.alumnosGestion.bo.AlumnoAsignatura;

public interface AlumnoAsignaturaRepository {
	public void inscribirAlumno(int legajo, int idAsignatura);
	public List<AlumnoAsignatura> listarInscripciones();
	public AlumnoAsignatura obtnerPorId(int legajo, int idAsignatura);
	public void eliminarAlumno(int legajo);
	public void eliminarAsignatura(int idAsignatura);
	public void modificarInscripcion(int legajoNuevo, int legajoViejo, int idAsignaturaNuevo, int idAsignaturaViejo);
}