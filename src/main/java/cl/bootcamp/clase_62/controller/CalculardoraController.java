package cl.bootcamp.clase_62.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bootcamp.clase_62.servicio.CalculadoraService;

@RestController
@RequestMapping("/calculadora")
public class CalculardoraController {
	
	
	private final CalculadoraService calculadora;
	
	public CalculardoraController(CalculadoraService calculadora) {
		this.calculadora=calculadora;
	}
	
	
	@GetMapping("/sumar/{num1}/{num2}")
	public String sumar(@PathVariable int num1, @PathVariable int num2) {
				
		int resultado=calculadora.sumar(num1, num2);
		return "El sultado es:"+resultado;
	}
	

}
