package cl.bootcamp.clase_62.repository.impl;

import org.springframework.stereotype.Repository;

import cl.bootcamp.clase_62.repository.CalculadoraRepository;

@Repository("CalculadoraRepositoryMysql")
public class CalculadoraRepositoryMysqlImpl implements CalculadoraRepository {

	@Override
	public void guardar(int resultado) {
		System.out.println("Guardando el resultado en mysql:"+resultado);
		
	}

}
