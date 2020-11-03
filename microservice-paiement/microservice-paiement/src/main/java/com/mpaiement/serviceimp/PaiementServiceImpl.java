package com.mpaiement.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import com.mpaiement.entity.Paiement;
import com.mpaiement.repository.IPaiementRepository;
import com.mpaiement.service.IPaiementService;

public class PaiementServiceImpl implements IPaiementService {

	@Autowired
	private IPaiementRepository repo;
	
	@Override
	public Paiement create(Paiement paiement) {
		if (repo.exists(Example.of(paiement))) {
			return null;
		} else {
			return repo.save(paiement);
		}
	}

	@Override
	public Paiement update(Paiement paiement) {
		if (repo.existsById(paiement.getId())) {
			return repo.save(paiement);
		} else {
			return null;
		}
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}

	@Override
	public Paiement readById(int id) {
		Optional<Paiement> op = repo.findById(id);
		return op.get();
	}

	@Override
	public List<Paiement> readAll() {
		return repo.findAll();
	}

}
