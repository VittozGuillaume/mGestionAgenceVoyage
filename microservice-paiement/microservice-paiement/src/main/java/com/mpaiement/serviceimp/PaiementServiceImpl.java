package com.mpaiement.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpaiement.entity.Paiement;
import com.mpaiement.repository.IPaiementRepository;
import com.mpaiement.service.IPaiementService;

@Service
public class PaiementServiceImpl implements IPaiementService {

	@Autowired
	private IPaiementRepository repo;

	@Override
	public void delete(Paiement paiement) {
		repo.delete(paiement);
	}

	@Override
	public List<Paiement> findAll() {
		return repo.findAll();
	}

	@Override
	public Optional<Paiement> findOne(Long id) {
		return repo.findById(id);
	}

	@Override
	public Paiement save(Paiement paiement) {
		return repo.save(paiement);
	}

}
