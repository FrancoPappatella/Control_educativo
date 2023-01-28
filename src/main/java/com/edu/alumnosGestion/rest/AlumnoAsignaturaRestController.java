package com.edu.alumnosGestion.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.edu.alumnosGestion.bo.Alumno;
import com.edu.alumnosGestion.bo.AlumnoAsignatura;
import com.edu.alumnosGestion.dto.AlumnoDTO;
import com.edu.alumnosGestion.service.AlumnoAsignaturaService;

@RestController
@RequestMapping("/gestion/alumnos/asignaturas")
public class AlumnoAsignaturaRestController {

	@Autowired
	private AlumnoAsignaturaService service;

	@PostMapping("/inscripcion/{legajo}/{idAsignatura}")
	public void inscribirAlumno(@PathVariable(name = "legajo") int legajo,
			@PathVariable(name = "idAsignatura") int idAsignatura) {
		service.inscribirAlumno(legajo, idAsignatura);
	}

	@GetMapping("/ver")
	public List<AlumnoAsignatura> listarAlumnos() {
		return service.listarInscripciones();
	}

	@GetMapping("/ver/{legajo}/{idAsignatura}")
	public AlumnoAsignatura buscarPorId(@PathVariable(name = "legajo") int legajo,
			@PathVariable(name = "idAsignatura") int idAsignatura) {
		return new AlumnoAsignatura(legajo, idAsignatura);

	}

	@DeleteMapping("/eliminar/{legajo}")
	public void eliminarAlumno(@PathVariable(name = "legajo") int legajo) {
		service.eliminarAlumno(legajo);
	}

	@DeleteMapping("/desinscribir/{idAsignatura}")
	public void desinscribirAlumno(@PathVariable(name = "idAsignatura") int idAsignatura) {
		service.desinscribirAlumno(idAsignatura);
	}

	@PutMapping("/modificar/{legajoNuevo}/{legajoViejo}/{idAsignaturaNuevo}/{idAsignaturaViejo}")
	public void modificarInscripcion(@PathVariable int legajoNuevo, @PathVariable int legajoViejo,
			@PathVariable int idAsignaturaNuevo, @PathVariable int idAsignaturaViejo) {
		service.modificarInscripcion(legajoNuevo, legajoViejo, idAsignaturaNuevo, idAsignaturaViejo);
	}
}
