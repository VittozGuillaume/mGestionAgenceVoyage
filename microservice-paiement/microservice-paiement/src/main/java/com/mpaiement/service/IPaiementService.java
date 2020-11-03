package com.mpaiement.service;

import java.util.List;
import java.util.Optional;

import com.mpaiement.entity.Paiement;

public interface IPaiementService {

	public Paiement save(Paiement paiement);

	public void delete(Paiement paiement);

	public List<Paiement> findAll();

	public Optional<Paiement> findOne(Long id);
}
