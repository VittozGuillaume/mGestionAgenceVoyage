package com.mreservation.service;

import java.util.List;
import java.util.Optional;

import com.mreservation.entity.Reservation;

public interface IReservationService {

	public Reservation save(Reservation reservation);

	public void delete(Reservation reservation);

	public List<Reservation> findAll();

	public Optional<Reservation> findOne(Long id);
}
