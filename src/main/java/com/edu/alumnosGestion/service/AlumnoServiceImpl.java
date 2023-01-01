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
		List<Alumno> repetidos = new ArrayList<>();
		List<Alumno> noRepetidos = new ArrayList<>();
		List<Alumno> listaFinal = new ArrayList<>();
		Object[] alumnosArray = alumnos.toArray();
		int legajo = 0;
		int i = 0;
		for (Object o : alumnosArray) {
			Alumno alumno = (Alumno) o;
			logger.info(
					"---------------------------ALUMNO:" + alumno.getApellido() + "-------------------------------");
			if (alumno.getLegajo() == legajo) {
				repetidos.add(alumno);
			} else {
				noRepetidos.add(alumno);
			}
			legajo = alumno.getLegajo();
			// List<Asignatura> asignaturasAux = alumno.getAsignaturas();
			i++;
		}
		
		for(Alumno aux1 : noRepetidos) {
			
			for(Alumno aux2 : repetidos) {
				if(aux1.getLegajo() == aux2.getLegajo()) {
					aux1.getAsignaturas().addAll(aux2.getAsignaturas());
				}
			}
			
			listaFinal.add(aux1);
		}
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
