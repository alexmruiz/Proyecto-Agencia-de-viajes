package com.reservas.reservas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ReservasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservasApplication.class, args);
	}

	//Activa la librería Ribbon para acceder al servicio utilizando eureka

	@LoadBalanced
	@Bean
	RestTemplate crearTemplate(){
	return new RestTemplate();
	}
}
