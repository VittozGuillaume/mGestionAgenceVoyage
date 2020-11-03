package com.mvol.microservicevol.service;

import java.util.List;

import com.mvol.microservicevol.entity.Vol;

public interface IVolService {

	public Vol create(Vol vol);

	public Vol update(Vol vol);

	public void delete(int id);

	public Vol readById(int id);

	public List<Vol> readAll();
}
