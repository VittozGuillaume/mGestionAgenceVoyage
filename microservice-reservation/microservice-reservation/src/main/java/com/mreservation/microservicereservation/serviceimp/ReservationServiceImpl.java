package com.mreservation.microservicereservation.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import com.mreservation.microservicereservation.entity.Reservation;
import com.mreservation.microservicereservation.repository.IReservationRepository;
import com.mreservation.microservicereservation.service.IReservationService;

public class ReservationServiceImpl implements IReservationService {

	@Autowired
	private IReservationRepository repo;

	@Override
	public Reservation create(Reservation reservation) {
		if (repo.exists(Example.of(reservation))) {
			return null;
		} else {
			return repo.save(reservation);
		}
	}

	@Override
	public Reservation update(Reservation reservation) {
		if (repo.existsById(reservation.getId())) {
			return repo.save(reservation);
		} else {
			return null;
		}
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);

	}

	@Override
	public Reservation readById(int id) {
		Optional<Reservation> op = repo.findById(id);
		return op.get();
	}

	@Override
	public List<Reservation> readAll() {
		return repo.findAll();
	}
}
