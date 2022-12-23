package com.edu.alumnosGestion.dto;

import com.edu.alumnosGestion.bo.Asignatura;
import com.edu.alumnosGestion.bo.Profesor;

public class AsignaturaDTO {
	private int idAsignatura;
	private Profesor profesor;
	private String despcripcion;

	public AsignaturaDTO(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public AsignaturaDTO(int idAsignatura, Profesor profesor) {
		this.idAsignatura = idAsignatura;
		this.profesor = profesor;
	}

	public AsignaturaDTO(Profesor profesor) {
		this.profesor = profesor;
	}

	public AsignaturaDTO(int idAsignatura, Profesor profesor, String despcripcion) {
		this.idAsignatura = idAsignatura;
		this.profesor = profesor;
		this.despcripcion = despcripcion;
	}
	public AsignaturaDTO(Asignatura asignatura) {
		this.idAsignatura = asignatura.getIdAsignatura();
		this.profesor = asignatura.getProfesor();
		this.despcripcion = asignatura.getDespcripcion();
	}
	public int getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public Profesor getIdProfesor() {
		return profesor;
	}

	public void setIdProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public String getDespcripcion() {
		return despcripcion;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public void setDespcripcion(String despcripcion) {
		this.despcripcion = despcripcion;
	}
}
