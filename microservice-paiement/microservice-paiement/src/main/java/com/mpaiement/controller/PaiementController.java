package com.mpaiement.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mpaiement.entity.Paiement;
import com.mpaiement.service.IPaiementService;

@RestController
public class PaiementController {

	@Autowired
	IPaiementService reservationService;

	@DeleteMapping("/paiements")
	public void delete(Paiement paiement) {
		reservationService.delete(paiement);
	}

	@GetMapping("/paiements")
	public List<Paiement> readAll() {
		return reservationService.findAll();
	}

	@GetMapping("/reservations/{idpaiement}")
	public Optional<Paiement> findOne(@PathParam("idpaiement") Long id) {
		return reservationService.findOne(id);
	}

	@PostMapping("/paiements")
	public Paiement save(@RequestBody Paiement paiement) {
		return reservationService.save(paiement);
	}
}
