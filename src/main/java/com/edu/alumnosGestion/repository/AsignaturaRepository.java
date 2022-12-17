package com.edu.alumnosGestion.repository;

import java.util.List;

import com.edu.alumnosGestion.bo.Asignatura;
import com.edu.alumnosGestion.bo.Profesor;

public interface AsignaturaRepository {
	public void altaAsignatura(Asignatura asignatura);
	public List<Asignatura> listarAsignaturas();
	public Asignatura obtnerPorId(int id);
	public void eliminarAsignatura(int id);
	public void modificarAsignatura(Asignatura asignatura , int id);
}
