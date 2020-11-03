package com.mvol.service;

import java.util.List;
import java.util.Optional;

import com.mvol.entity.Vol;

public interface IVolService {

	public Vol save(Vol vol);

	public void delete(Vol vol);

	public List<Vol> findAll();

	public Optional<Vol> findOne(Long id);
}
