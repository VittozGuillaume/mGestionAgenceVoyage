package com.mreservation.microservicereservation.service;

import java.util.List;

import com.mreservation.microservicereservation.entity.Reservation;

public interface IReservationService {

	public Reservation create(Reservation reservation);

	public Reservation update(Reservation reservation);

	public void delete(int id);

	public Reservation readById(int id);

	public List<Reservation> readAll();
}
