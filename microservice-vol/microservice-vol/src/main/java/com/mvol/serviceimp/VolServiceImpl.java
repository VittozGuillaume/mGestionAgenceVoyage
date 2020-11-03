package com.mvol.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvol.entity.Vol;
import com.mvol.repository.IVolRepository;
import com.mvol.service.IVolService;
@Service
public class VolServiceImpl implements IVolService {

	@Autowired
	IVolRepository repo;

	@Override
	public void delete(Vol vol) {
		repo.delete(vol);
	}

	@Override
	public List<Vol> findAll() {
		return repo.findAll();
	}

	@Override
	public Optional<Vol> findOne(Long id) {
		return repo.findById(id);
	}

	@Override
	public Vol save(Vol vol) {
		return repo.save(vol);
	}
}
