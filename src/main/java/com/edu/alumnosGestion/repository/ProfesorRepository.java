package com.edu.alumnosGestion.repository;

import java.util.List;

import com.edu.alumnosGestion.bo.*;

public interface ProfesorRepository {

	public void altaProfesor(Profesor profesor);
	public List<Profesor> listarProfesores();
	public Profesor obtnerPorId(int id);
	public void eliminarProfesor(int id);
	public void modificarProfesor(Profesor profesor , int id);
}
