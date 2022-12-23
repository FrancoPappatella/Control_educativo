package com.edu.alumnosGestion.rest;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.edu.alumnosGestion.dto.AsignaturaDTO;
import com.edu.alumnosGestion.service.AsignaturaService;
 
@RestController
@RequestMapping("/gestion/asignaturas")
public class AsignaturaRestControler {

	@Autowired
	AsignaturaService asignaturaService;
	
	@PostMapping("/alta")
	public void altaAsignatura(@RequestBody AsignaturaDTO asignaturaDTO) {
		
	}
	
	
}
