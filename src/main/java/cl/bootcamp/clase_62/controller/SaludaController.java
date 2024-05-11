package cl.bootcamp.clase_62.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bootcamp.clase_62.servicio.SaludarService;

@RestController
@RequestMapping("/saludar")
public class SaludaController {
	
	@Qualifier("SaludarServiceEn")
	@Autowired
	private SaludarService saludarService;
	
	
	@GetMapping("/{nombre}")
	public String decirHola(@PathVariable String nombre) {
		return saludarService.saludar(nombre);
	}
	

}
