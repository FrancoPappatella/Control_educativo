package com.edu.alumnosGestion.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.edu.alumnosGestion.bo.Alumno;

public interface AlumnoRepository {
	
	public void altaAlumno(Alumno a);
	public List<Alumno> listarAlumnos();
	public Alumno obtnerPorId(int legajo);
	public void eliminarAlumno(int legajo);
	public void modificarAlumno(Alumno a, int legajo);

}
