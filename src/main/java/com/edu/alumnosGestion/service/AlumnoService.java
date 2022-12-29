package com.edu.alumnosGestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.alumnosGestion.bo.Alumno;

public interface AlumnoService {
	public void altaAlumno(Alumno a);
	public List<Alumno> listarAlumnos();
	public Alumno obtnerPorId(int legajo);
	public void eliminarAlumno(int legajo);
	public void modificarAlumno(Alumno a, int legajo);
}
