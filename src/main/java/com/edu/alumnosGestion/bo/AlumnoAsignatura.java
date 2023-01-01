package com.edu.alumnosGestion.bo;

public class AlumnoAsignatura {
	private int idAlumno;
	private int idAsignatura;
	
	public AlumnoAsignatura() {
		
	}
	public AlumnoAsignatura(int idAlumno, int idAsignatura) {
		this.idAlumno = idAlumno;
		this.idAsignatura = idAsignatura;
	}
	public int getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	public int getIdAsignatura() {
		return idAsignatura;
	}
	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}
	
}
