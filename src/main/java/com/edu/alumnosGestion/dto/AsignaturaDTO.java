package com.edu.alumnosGestion.dto;

import com.edu.alumnosGestion.bo.Asignatura;
import com.edu.alumnosGestion.bo.Profesor;

public class AsignaturaDTO {
	private int idAsignatura;
	private Profesor profesor;
	private String descripcion;
	
	public AsignaturaDTO(){
		
	}

	public AsignaturaDTO(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public AsignaturaDTO(String descripcion, Profesor profesor) {
		this.descripcion = descripcion;
		this.profesor = profesor;
	}


	public AsignaturaDTO(int idAsignatura, Profesor profesor, String descripcion) {
		this.idAsignatura = idAsignatura;
		this.profesor = profesor;
		this.descripcion = descripcion;
	}
	public AsignaturaDTO(Asignatura asignatura) {
		this.idAsignatura = asignatura.getIdAsignatura();
		this.profesor = asignatura.getProfesor();
		this.descripcion = asignatura.getDescripcion();
	}
	public int getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public int getIdProfesor() {
		return profesor.getIdProfesor();
	}

	public void setIdProfesor(Profesor profesor) {
		this.profesor.setIdProfesor(profesor.getIdProfesor());
	}

	public String getDespcripcion() {
		return descripcion;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public void setDespcripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
