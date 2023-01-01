package com.edu.alumnosGestion.bo;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Asignatura {
	private int idAsignatura;
	private Profesor profesor;
	private String descripcion;
	private List<Alumno> alumnos;

	public Asignatura() {

	}

	public Asignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public Asignatura(String descripcion, Profesor profesor) {
		this.descripcion = descripcion;
		this.profesor = profesor;
	}

	public Asignatura(int idAsignatura, Profesor profesor) {
		this.idAsignatura = idAsignatura;
		this.profesor = profesor;
	}

	public Asignatura(Profesor profesor) {
		this.profesor = profesor;
	}

	public Asignatura(int idAsignatura, Profesor profesor, String despcripcion) {
		this.idAsignatura = idAsignatura;
		this.profesor = profesor;
		this.descripcion = despcripcion;
	}

	public Asignatura(int idAsignatura, Profesor profesor, String descripcion, List<Alumno> alumnos) {
		this.idAsignatura = idAsignatura;
		this.profesor = profesor;
		this.descripcion = descripcion;
		this.alumnos = alumnos;
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

	public String getDescripcion() {
		return descripcion;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAsignatura);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asignatura other = (Asignatura) obj;
		return idAsignatura == other.idAsignatura;
	}

	@Override
	public String toString() {
		return "Asignatura [idAsignatura=" + idAsignatura + ", profesor=" + profesor + ", descripcion=" + descripcion
				+ "]";
	}

}
