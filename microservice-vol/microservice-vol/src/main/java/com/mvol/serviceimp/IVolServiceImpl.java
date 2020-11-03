package com.mvol.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import com.mvol.entity.Vol;
import com.mvol.repository.IVolRepository;
import com.mvol.service.IVolService;

public class IVolServiceImpl implements IVolService {

	@Autowired
	private IVolRepository repo;

	@Override
	public Vol create(Vol vol) {
		if (repo.exists(Example.of(vol))) {
			return null;
		} else {
			return repo.save(vol);
		}
	}

	@Override
	public Vol update(Vol vol) {
		if (repo.existsById(vol.getId())) {
			return repo.save(vol);
		} else {
			return null;
		}
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);

	}

	@Override
	public Vol readById(int id) {
		Optional<Vol> op = repo.findById(id);
		return op.get();
	}

	@Override
	public List<Vol> readAll() {
		return repo.findAll();
	}
}
