package com.edu.alumnosGestion.service;

import java.util.List;

import com.edu.alumnosGestion.bo.AlumnoAsignatura;

public interface AlumnoAsignaturaService {
	
	public void inscribirAlumno(int legajo, int idAsignatura);

	public List<AlumnoAsignatura> listarInscripciones();

	public AlumnoAsignatura obtnerPorId(int legajo, int idAsignatura);

	public void eliminarAlumno(int legajo);

	public void desinscribirAlumno(int idAsignatura);

	public void modificarInscripcion(int legajoNuevo, int legajoViejo, int idAsignaturaNuevo, int idAsignaturaViejo);
}