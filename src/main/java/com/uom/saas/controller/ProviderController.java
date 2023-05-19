package com.uom.saas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uom.saas.entiry.Provider;
import com.uom.saas.service.ProviderService;

@CrossOrigin
@RestController
public class ProviderController {
	
	@Autowired
	private ProviderService service;
	
	@PostMapping("/addProvider")
	public String addProvider(@RequestBody Provider provider) {
		String response = service.addProvider(provider);
		return response;
	}
	
	@GetMapping("/getAllProviders")
	public List<Provider> getAllProviders() {
		List<Provider> allProviders = service.getAllProviders();
		return allProviders;
		
	}


}
