package com.clientui.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.clientui.beans.ReservationBean;

@FeignClient(name="microservice-reservation", url="localhost:9091")
public interface MicroServiceReservationProxies {
	@GetMapping(value ="/reservations")
	List<ReservationBean> findAll();
}
