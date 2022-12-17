package com.edu.alumnosGestion.bo;

import java.util.Objects;

public class Asignatura {
	private int idAsignatura;
	private Profesor profesor;
	private String despcripcion;
	public Asignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
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
		this.despcripcion = despcripcion;
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
		return "Asignatura [idAsignatura=" + idAsignatura + ", profesor=" + profesor + ", despcripcion="
				+ despcripcion + "]";
	}
	
	
}
