package com.edu.alumnosGestion.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.edu.alumnosGestion.bo.Alumno;
import com.edu.alumnosGestion.bo.Asignatura;
import com.edu.alumnosGestion.bo.Profesor;

public class AsignaturaDTO {
	private int idAsignatura;
	private Profesor profesor;
	private String descripcion;
	private List<Alumno> alumnos;

	public AsignaturaDTO() {

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

	public AsignaturaDTO(int idAsignatura, Profesor profesor, String descripcion, List<Alumno> alumnos) {
		this.idAsignatura = idAsignatura;
		this.profesor = profesor;
		this.descripcion = descripcion;
		this.alumnos = alumnos;
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
}
