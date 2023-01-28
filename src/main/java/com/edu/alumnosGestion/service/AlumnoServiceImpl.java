package com.edu.alumnosGestion.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.alumnosGestion.AlumnosGestionApplication;
import com.edu.alumnosGestion.bo.Alumno;
import com.edu.alumnosGestion.bo.Asignatura;
import com.edu.alumnosGestion.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	Logger logger = LoggerFactory.getLogger(AlumnosGestionApplication.class);

	@Autowired
	AlumnoRepository alumnoRepository;

	@Override
	public void altaAlumno(Alumno a) {
		alumnoRepository.altaAlumno(a);
	}

	@Override
	public List<Alumno> listarAlumnos() {
		List<Alumno> alumnos = alumnoRepository.listarAlumnos();
		List<Alumno> listaFinal = Alumno.Formatear(alumnos);
		return listaFinal;
	}

	@Override
	public Alumno obtnerPorId(int legajo) {
		return alumnoRepository.obtnerPorId(legajo);
	}

	@Override
	public void eliminarAlumno(int legajo) {
		alumnoRepository.eliminarAlumno(legajo);
	}

	@Override
	public void modificarAlumno(Alumno alumno, int legajo) {
		alumnoRepository.modificarAlumno(alumno, legajo);
	}

}
