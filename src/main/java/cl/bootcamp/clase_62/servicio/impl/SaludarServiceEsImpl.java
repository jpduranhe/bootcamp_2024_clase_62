package cl.bootcamp.clase_62.servicio.impl;

import org.springframework.stereotype.Service;

import cl.bootcamp.clase_62.servicio.SaludarService;



@Service("SaludarServiceEs")
public class SaludarServiceEsImpl implements SaludarService{

	@Override
	public String saludar(String nombre) {
		// TODO Auto-generated method stub
		return "Hola "+nombre;
	}

}
