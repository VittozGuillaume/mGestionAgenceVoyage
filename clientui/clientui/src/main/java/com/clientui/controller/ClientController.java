package com.clientui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.clientui.beans.ReservationBean;
import com.clientui.beans.VolBean;
import com.clientui.proxies.MicroServiceReservationProxies;
import com.clientui.proxies.MicroServiceVolProxies;

@Controller
public class ClientController {

	@Autowired
	private MicroServiceVolProxies microServiceVolProxies;
	private MicroServiceReservationProxies microServiceReservationProxies;

	@GetMapping("/")
	public String accueil(Model model) {
		List<VolBean> vols = microServiceVolProxies.findAll();
		model.addAttribute("vols", vols);
//		List<ReservationBean> reservations = microServiceReservationProxies.readAll();
//		model.addAttribute("reservations", reservations);
		return "Accueil";
	}

}
