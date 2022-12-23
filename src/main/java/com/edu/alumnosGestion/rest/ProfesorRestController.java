package com.edu.alumnosGestion.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.alumnosGestion.bo.Profesor;
import com.edu.alumnosGestion.dto.ProfesorDTO;
import com.edu.alumnosGestion.service.ProfesorService;

@RestController
@RequestMapping("/gestion/profesores")
public class ProfesorRestController {
	@Autowired
	private ProfesorService profesorService;

	@PostMapping("/alta")
	public void altaProfesor(@RequestBody ProfesorDTO profesorDTO) {
		Profesor profesor = new Profesor();
		profesor.setIdProfesor(profesorDTO.getIdProfesor());
		profesor.setNombre(profesorDTO.getNombre());
		profesor.setApellido(profesorDTO.getApellido());
		profesorService.altaProfesor(profesor);
	}

	@GetMapping("/ver")
	public List<ProfesorDTO> listarProfesores() {
		List<Profesor> profesores = profesorService.listarProfesores();
		List<ProfesorDTO> profesoresDto = new ArrayList<>();
		for (Profesor profesor : profesores) {
			profesoresDto.add(new ProfesorDTO(profesor));
		}
		return profesoresDto;

	}

	@GetMapping("/ver/{id}")
	public ProfesorDTO buscarPorId(@PathVariable(name = "id") int id) {
		ProfesorDTO profesorDTO = new ProfesorDTO(profesorService.obtnerPorId(id));
		return profesorDTO;

	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminarProfesor(@PathVariable(name = "id") int id) {
		profesorService.eliminarProfesor(id);
	}

	@PutMapping("/modificar/{id}")
	public void modificarProfesor(@PathVariable(name = "id") int id, @RequestBody ProfesorDTO profesorDTO) {
		Profesor profesor = new Profesor();
		profesor.setIdProfesor(profesorDTO.getIdProfesor());
		profesor.setNombre(profesorDTO.getNombre());
		profesor.setApellido(profesorDTO.getApellido());
		profesorService.modificarProfesor(null, id);
	}

}
