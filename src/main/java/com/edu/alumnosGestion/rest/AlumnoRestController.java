package com.edu.alumnosGestion.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import com.edu.alumnosGestion.bo.Alumno;
import com.edu.alumnosGestion.dto.AlumnoDTO;
import com.edu.alumnosGestion.service.AlumnoService;

@RestController
@RequestMapping("/gestion/alumnos")
public class AlumnoRestController {
	
	@Autowired
	private AlumnoService service;
	
	@PostMapping("/alta")
	public Alumno altaAlumno( @RequestBody AlumnoDTO alumnoDto) {
		Alumno alumno = new Alumno();
		alumno.setLegajo(alumnoDto.getLegajo());
		alumno.setNombre(alumnoDto.getNombre());
		alumno.setApellido(alumnoDto.getApellido());
		alumno.setEdad(alumnoDto.getEdad());
		alumno.setActivo(alumnoDto.isActivo());
		service.altaAlumno(alumno);
		return alumno;
	}
	
	@GetMapping("/ver")
	public List<Alumno> listarAlumnos(){
		List<Alumno> alumnos = service.listarAlumnos();
		return alumnos;
		
	}
	
	@GetMapping("/ver/{legajo}")
	public Alumno buscarPorId(@PathVariable int legajo){
		return service.obtnerPorId(legajo);
		
	}
	
	@DeleteMapping("/eliminar/{legajo}")
	public void eliminarAlumno(@PathVariable int legajo) {
		service.eliminarAlumno(legajo);
	}
	
	@PutMapping("/modificar/{legajo}")
	public void modificarAlumno(@RequestBody AlumnoDTO alumnoDto,@PathVariable int legajo) {
		Alumno alumno = new Alumno();
		alumno.setLegajo(legajo);
		alumno.setNombre(alumnoDto.getNombre());
		alumno.setApellido(alumnoDto.getApellido());
		alumno.setEdad(alumnoDto.getEdad());
		alumno.setActivo(alumnoDto.isActivo());
		service.modificarAlumno(alumno, legajo);
	}
	
	

	
	
	
}
