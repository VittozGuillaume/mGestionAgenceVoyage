package com.mreservation.microservicereservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mreservation.microservicereservation.entity.Reservation;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation, Integer>{

	
}
