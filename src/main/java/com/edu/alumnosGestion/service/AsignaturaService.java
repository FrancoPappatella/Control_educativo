package com.edu.alumnosGestion.service;

import java.util.List;

import com.edu.alumnosGestion.bo.Alumno;
import com.edu.alumnosGestion.bo.Asignatura;

public interface AsignaturaService {
	public void altaAsignatura(Asignatura a);
	public List<Asignatura> listarAsignatura();
	public Asignatura obtnerPorId(int id);
	public void eliminarAsignatura(int id);
	public void modificarAsignatura(Asignatura a, int id);
}
