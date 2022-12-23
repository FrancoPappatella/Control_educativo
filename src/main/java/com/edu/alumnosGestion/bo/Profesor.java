package com.edu.alumnosGestion.bo;

import java.util.Objects;

public class Profesor {
	private int idProfesor;
	private String nombre;
	private String apellido;

	public Profesor() {
	}
	
	public Profesor(int id) {
		this.idProfesor = id;
	}
	
	public Profesor(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Profesor(int idProfesor, String nombre, String apellido) {
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

	@Override
	public int hashCode() {
		return Objects.hash(idProfesor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		return idProfesor == other.idProfesor;
	}

	@Override
	public String toString() {
		return "Profesor [idProfesor=" + idProfesor + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
