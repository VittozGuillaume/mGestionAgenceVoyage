package com.mreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mreservation.entity.Reservation;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation, Long>{

	
}
