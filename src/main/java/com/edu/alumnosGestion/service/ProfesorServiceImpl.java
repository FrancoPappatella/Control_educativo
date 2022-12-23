package com.edu.alumnosGestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edu.alumnosGestion.bo.Profesor;
import com.edu.alumnosGestion.repository.ProfesorRepository;

public class ProfesorServiceImpl implements ProfesorService {

	@Autowired
	ProfesorRepository profesorRepository;

	@Override
	public void altaProfesor(Profesor profesor) {
		profesorRepository.altaProfesor(profesor);
	}

	@Override
	public List<Profesor> listarProfesores() {
		return profesorRepository.listarProfesores();
	}

	@Override
	public Profesor obtnerPorId(int id) {
		return profesorRepository.obtnerPorId(id);
	}

	@Override
	public void eliminarProfesor(int id) {
		profesorRepository.eliminarProfesor(id);
	}

	@Override
	public void modificarProfesor(Profesor profesor, int id) {
		profesorRepository.modificarProfesor(profesor, id);
	}

}
