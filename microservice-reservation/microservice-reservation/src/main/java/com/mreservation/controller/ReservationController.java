package com.mreservation.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mreservation.entity.Reservation;
import com.mreservation.service.IReservationService;

@RestController
public class ReservationController {

	@Autowired
	IReservationService reservationService;

	@DeleteMapping("/reservations")
	public void delete(Reservation reservation) {
		reservationService.delete(reservation);
	}

	@GetMapping("/reservations")
	public List<Reservation> readAll() {
		return reservationService.findAll();
	}

	@GetMapping("/reservations/{idReservation}")
	public Optional<Reservation> findOne(@PathParam("idReservation") Long id) {
		return reservationService.findOne(id);
	}

	@PostMapping("/reservations")
	public Reservation save(@RequestBody Reservation reservation) {
		return reservationService.save(reservation);
	}
}
