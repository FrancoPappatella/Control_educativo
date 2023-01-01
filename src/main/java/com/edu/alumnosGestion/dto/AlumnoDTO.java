package com.edu.alumnosGestion.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.edu.alumnosGestion.bo.Alumno;
import com.edu.alumnosGestion.bo.Asignatura;

public class AlumnoDTO {
	private int legajo;
	private String nombre;
	private String apellido;
	private int edad;
	private boolean activo;
	private List<Asignatura> asignaturas = new ArrayList<>();

	public AlumnoDTO() {
	}

	public AlumnoDTO(int legajo, String nombre, String apellido, int edad, boolean activo) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.activo = activo;
	}

	public AlumnoDTO(int legajo, String nombre, String apellido, int edad, boolean activo,
			List<Asignatura> asignaturas) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.activo = activo;
		this.asignaturas = asignaturas;
	}

	public AlumnoDTO(Alumno a) {
		this.legajo = a.getLegajo();
		this.nombre = a.getNombre();
		this.apellido = a.getApellido();
		this.edad = a.getEdad();
		this.activo = a.isActivo();
		this.asignaturas = a.getAsignaturas();
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

	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

}
