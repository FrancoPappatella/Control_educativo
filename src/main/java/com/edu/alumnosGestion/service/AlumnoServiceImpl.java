package com.edu.alumnosGestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.alumnosGestion.bo.Alumno;
import com.edu.alumnosGestion.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	AlumnoRepository alumnoRepository;

	@Override
	public void altaAlumno(Alumno a) {
		// TODO Auto-generated method stub
		alumnoRepository.altaAlumno(a);
		
	}

	@Override
	public List<Alumno> listarAlumnos() {
		return alumnoRepository.listarAlumnos();
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
