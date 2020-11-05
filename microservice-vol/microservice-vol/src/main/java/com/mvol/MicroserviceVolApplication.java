package com.mvol;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.mvol.entity.Vol;
import com.mvol.repository.IVolRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceVolApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceVolApplication.class, args);
	}

	@Bean
	CommandLineRunner start(IVolRepository volRepository) {
		return (args) -> {
			Stream.of(new Vol("Madrid", "Vol pour Madrid"), new Vol("Paris", "Vol pour Paris"),
					new Vol("Dakar", "Paris-Dakar"), new Vol("NYCity", "TrumpVsBiden"),
					new Vol("Sao Paulo", "Vol pour Sao Paulo")).forEach((v) -> {
						volRepository.save(v);

					});
		};
	}

}
