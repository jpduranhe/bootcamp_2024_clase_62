package cl.bootcamp.clase_62;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cl.bootcamp.clase_62")
public class Clase62Application {

	public static void main(String[] args) {
		SpringApplication.run(Clase62Application.class, args);
	}

}
