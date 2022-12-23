package com.edu.alumnosGestion.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.edu.alumnosGestion.bo.Asignatura;
import com.edu.alumnosGestion.dto.AsignaturaDTO;
import com.edu.alumnosGestion.service.AsignaturaService;

@RestController
@RequestMapping("/gestion/asignaturas")
public class AsignaturaRestControler {

	@Autowired
	AsignaturaService asignaturaService;

	@PostMapping("/alta")
	public void altaAsignatura(@RequestBody AsignaturaDTO asignaturaDTO) {
		Asignatura asignatura = new Asignatura();
		asignatura.setIdAsignatura(asignaturaDTO.getIdAsignatura());
		asignatura.setDespcripcion(asignaturaDTO.getDespcripcion());
		asignatura.setProfesor(asignaturaDTO.getProfesor());

		asignaturaService.altaAsignatura(asignatura);
	}

	@GetMapping("/ver")
	public List<AsignaturaDTO> listarAsignaturas() {
		List<Asignatura> asignaturas = asignaturaService.listarAsignatura();
		List<AsignaturaDTO> asignaturasDTO = new ArrayList<>();
		for (Asignatura asignatura : asignaturas) {
			asignaturasDTO.add(new AsignaturaDTO(asignatura));
		}
		return asignaturasDTO;
	}

	@GetMapping("/ver/{id}")
	public AsignaturaDTO obtenerPorId(@PathVariable(name = "id") int id) {
		AsignaturaDTO asignaturaDTO = new AsignaturaDTO(asignaturaService.obtnerPorId(id));
		return asignaturaDTO;
	}

	@PutMapping("/modificar/{id}")
	public void modificarAsignatura(@PathVariable(name = "id") int id, @RequestBody AsignaturaDTO asignaturaDTO) {
		Asignatura asignatura = new Asignatura();
		asignatura.setIdAsignatura(asignaturaDTO.getIdAsignatura());
		asignatura.setDespcripcion(asignaturaDTO.getDespcripcion());
		asignatura.setProfesor(asignaturaDTO.getProfesor());
		asignaturaService.modificarAsignatura(asignatura, id);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarAsignatura(@PathVariable(name = "id") int id, @RequestBody AsignaturaDTO asignaturaDTO) {
		asignaturaService.eliminarAsignatura(id);
	}
	
}
