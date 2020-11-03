package com.clientui.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.clientui.beans.VolBean;

@FeignClient(name="microservice-vol",url="localhost:9092")
public interface MicroServiceVolProxies {
	@GetMapping(value="/vols")
	List<VolBean> findAll();
}
