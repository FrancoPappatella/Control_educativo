package com.edu.alumnosGestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.alumnosGestion.bo.AlumnoAsignatura;
import com.edu.alumnosGestion.repository.AlumnoAsignaturaRepository;

@Service
public class AlumnoAsignaturaServiceImpl implements AlumnoAsignaturaService {
	
	@Autowired
	private AlumnoAsignaturaRepository repository;
	
	@Override
	public void inscribirAlumno(int legajo, int idAsignatura) {
		repository.inscribirAlumno(legajo, idAsignatura);
	}

	@Override
	public List<AlumnoAsignatura> listarInscripciones() {
		return repository.listarInscripciones();
	}

	@Override
	public AlumnoAsignatura obtnerPorId(int legajo, int idAsignatura) {
		return repository.obtnerPorId(legajo, idAsignatura);
	}

	@Override
	public void eliminarAlumno(int legajo) {
		repository.eliminarAlumno(legajo);
	}

	@Override
	public void desinscribirAlumno(int idAsignatura) {
		repository.eliminarAsignatura(idAsignatura); //Se desinscribe al alumno de la asignatura
	}

	@Override
	public void modificarInscripcion(int legajoNuevo, int legajoViejo, int idAsignaturaNuevo, int idAsignaturaViejo) {
		repository.modificarInscripcion(legajoNuevo, legajoViejo, idAsignaturaNuevo, idAsignaturaViejo);
	}

}
