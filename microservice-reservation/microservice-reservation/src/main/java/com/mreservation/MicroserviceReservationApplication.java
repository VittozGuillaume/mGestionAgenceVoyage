package com.mreservation;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.mreservation.entity.Reservation;
import com.mreservation.repository.IReservationRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceReservationApplication.class, args);
	}

	@Bean
	CommandLineRunner start(IReservationRepository reservationRepository) {
		return (args) -> {
			Stream.of(new Reservation(2, 1, true), new Reservation(3, 2, false)).forEach((r) -> {
				reservationRepository.save(r);
			});
		};
	}
}
