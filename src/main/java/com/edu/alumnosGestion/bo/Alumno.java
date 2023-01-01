package com.edu.alumnosGestion.bo;

import javax.persistence.ManyToMany;

import org.hibernate.annotations.*;
import org.springframework.data.annotation.*;

import java.util.*;

public class Alumno {
	private int legajo;
	private String nombre;
	private String apellido;
	private int edad;
	private boolean activo;
	private List<Asignatura> asignaturas;

	public Alumno() {

	}

	public Alumno(int legajo) {
		this.legajo = legajo;
	}

	public Alumno(String nombre, String apellido, int edad, boolean activo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.activo = activo;
	}

	public Alumno(int legajo, String nombre, String apellido, int edad, boolean activo) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.activo = activo;
	}

	public Alumno(int legajo, String nombre, String apellido, int edad, boolean activo,
			List<Asignatura> asignaturas) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.activo = activo;
		this.asignaturas = asignaturas;
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

	@Override
	public int hashCode() {
		return Objects.hash(legajo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return legajo == other.legajo;
	}

	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", activo=" + activo + "]";
	}

}
