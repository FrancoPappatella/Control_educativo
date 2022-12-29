package com.edu.alumnosGestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.alumnosGestion.bo.Asignatura;
import com.edu.alumnosGestion.repository.AsignaturaRepository;

@Service
public class AsignaturaServiceImpl implements AsignaturaService {

	@Autowired
	private AsignaturaRepository asignaturaRepository;

	@Override
	public void altaAsignatura(Asignatura a) {
		asignaturaRepository.altaAsignatura(a);
	}

	@Override
	public List<Asignatura> listarAsignatura() {
		return asignaturaRepository.listarAsignaturas();
	}

	@Override
	public Asignatura obtnerPorId(int id) {
		return asignaturaRepository.obtnerPorId(id);
	}

	@Override
	public void eliminarAsignatura(int id) {
		asignaturaRepository.eliminarAsignatura(id);
	}

	@Override
	public void modificarAsignatura(Asignatura a, int id) {
		asignaturaRepository.modificarAsignatura(a, id);
	}

}
