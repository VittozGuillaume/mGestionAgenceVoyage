package com.mreservation.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mreservation.entity.Reservation;
import com.mreservation.repository.IReservationRepository;
import com.mreservation.service.IReservationService;

@Service
public class ReservationServiceImpl implements IReservationService {

	@Autowired
	private IReservationRepository repo;


	@Override
	public void delete(Reservation reservation) {
		repo.delete(reservation);
	}

	@Override
	public List<Reservation> findAll() {
		return repo.findAll();
	}

	@Override
	public Optional<Reservation> findOne(Long id) {
		return repo.findById(id);
	}

	@Override
	public Reservation save(Reservation reservation) {
		return repo.save(reservation);
	}
}
