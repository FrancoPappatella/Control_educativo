package com.edu.alumnosGestion.dto;

public class AlumnoDTO {
	private int legajo;
	private String nombre;
	private String apellido;
	private int edad;
	private boolean activo;
	public AlumnoDTO() {
	}
	public AlumnoDTO(int legajo, String nombre, String apellido, int edad, boolean activo) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.activo = activo;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	} 
	
}
