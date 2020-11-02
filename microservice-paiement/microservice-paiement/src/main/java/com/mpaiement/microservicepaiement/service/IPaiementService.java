package com.mpaiement.microservicepaiement.service;

import java.util.List;

import com.mpaiement.microservicepaiement.entity.Paiement;

public interface IPaiementService {

public Paiement create(Paiement paiement);
	
	public Paiement update(Paiement paiement);
	
	public void delete(int id);
	
	public Paiement readById(int id);
	
	public List<Paiement> readAll();
}
