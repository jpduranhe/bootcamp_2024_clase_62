package cl.bootcamp.clase_62.repository.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import cl.bootcamp.clase_62.repository.CalculadoraRepository;

@Repository("CalculadoraRepositoryOracle")
public class CalculadoraRepositoryOracleImpl implements CalculadoraRepository {

	@Override
	public void guardar(int resultado) {
		System.out.println("Guardando el resultado en oracle:"+resultado);
		
	}

}
