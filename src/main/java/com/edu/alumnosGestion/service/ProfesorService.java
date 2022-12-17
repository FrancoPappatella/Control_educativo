package com.edu.alumnosGestion.service;

import java.util.List;

import com.edu.alumnosGestion.bo.Profesor;

public interface ProfesorService {
	public void altaProfesor(Profesor profesor);
	public List<Profesor> listarProfesores();
	public Profesor obtnerPorId(int id);
	public void eliminarProfesor(int id);
	public void modificarProfesor(Profesor profesor , int id);
}
