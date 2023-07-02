package co.edu.udec.act3.jonnyluna.vehiculos.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "co.edu.udec.act3.jonnyluna.vehiculos")
@EnableJpaRepositories(basePackages = "co.edu.udec.act3.jonnyluna.vehiculos.repository.dao")
@EntityScan("co.edu.udec.act3.jonnyluna.vehiculos.model")
public class VehiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiculosApplication.class, args);
	}

}
