package cl.bootcamp.clase_62.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cl.bootcamp.clase_62.repository.CalculadoraRepository;
import cl.bootcamp.clase_62.servicio.CalculadoraService;


@Service
public class CalculadoraServiceImpl implements CalculadoraService {
	@Qualifier("CalculadoraRepositoryOracle")
	@Autowired
	private  CalculadoraRepository calculadoraRepository;
	
	

	@Override
	public int sumar(int num1, int num2) {
		System.out.println("Sumando");
		int resultado= num1+num2;
		calculadoraRepository.guardar(resultado);
		
		return resultado;
	}

	@Override
	public int restar(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

}
