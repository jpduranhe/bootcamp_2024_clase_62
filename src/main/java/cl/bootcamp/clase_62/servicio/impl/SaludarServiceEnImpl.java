package cl.bootcamp.clase_62.servicio.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import cl.bootcamp.clase_62.servicio.SaludarService;

@Service("SaludarServiceEn")
public class SaludarServiceEnImpl implements SaludarService{

	@Override
	public String saludar(String nombre) {
		// TODO Auto-generated method stub
		return "Hello "+nombre;
	}

}
