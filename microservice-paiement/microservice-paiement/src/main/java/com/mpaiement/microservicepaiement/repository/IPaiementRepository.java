package com.mpaiement.microservicepaiement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpaiement.microservicepaiement.entity.Paiement;

@Repository
public interface IPaiementRepository extends JpaRepository<Paiement, Integer> {

}
