package com.mpaiement.microservicepaiement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paiement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Integer idReservation;
	
	private Integer montant;
	
	private Long numeroCarte;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Integer idReservation) {
		this.idReservation = idReservation;
	}

	public Integer getMontant() {
		return montant;
	}

	public void setMontant(Integer montant) {
		this.montant = montant;
	}

	public Long getNumeroCarte() {
		return numeroCarte;
	}

	public void setNumeroCarte(Long numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	@Override
	public String toString() {
		return "Paiement [id=" + id + ", idReservation=" + idReservation + ", montant=" + montant + ", numeroCarte="
				+ numeroCarte + "]";
	}

	public Paiement(int id, Integer idReservation, Integer montant, Long numeroCarte) {
		super();
		this.id = id;
		this.idReservation = idReservation;
		this.montant = montant;
		this.numeroCarte = numeroCarte;
	}

	public Paiement() {
		
	}
	
	
}
