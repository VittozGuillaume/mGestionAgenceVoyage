package com.mvol.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvol.entity.Vol;
import com.mvol.service.IVolService;

@RestController
public class VolController {

	@Autowired
	IVolService volService;

	@DeleteMapping("/vols")
	public void delete(Vol vol) {
		volService.delete(vol);
	}

	@GetMapping("/vols")
	public List<Vol> readAll() {
		return volService.findAll();
	}
	
	// @PathParam   http://localhost:9090/vols/1
	// @RequestParam  http://localhost:9090/vols?id=1
	
	@GetMapping("/vols/{idVol}")
	public Optional<Vol> findOne(@PathParam("idVol")Long id) {
		return volService.findOne(id);
	}

	@PostMapping("/vols")
	public Vol save(@RequestBody Vol vol) {
		return volService.save(vol);
	}
}
