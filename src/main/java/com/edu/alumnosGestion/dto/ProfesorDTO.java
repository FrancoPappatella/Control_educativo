package com.edu.alumnosGestion.dto;

import com.edu.alumnosGestion.bo.Profesor;

public class ProfesorDTO {
	private int idProfesor;
	private String nombre;
	private String apellido;

	public ProfesorDTO() {
	}
	
	public ProfesorDTO(Profesor profesor) {
		this.idProfesor = profesor.getIdProfesor();
		this.nombre = profesor.getNombre();
		this.apellido = profesor.getApellido();
	}

	public ProfesorDTO(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public ProfesorDTO(int idProfesor, String nombre, String apellido) {
		this.idProfesor = idProfesor;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
