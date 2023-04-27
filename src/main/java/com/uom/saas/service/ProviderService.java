package com.uom.saas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uom.saas.entiry.Provider;
import com.uom.saas.repository.ProviderRepository;

@Service
public class ProviderService {
	
	@Autowired
	private ProviderRepository repository;
	
	public String addProvider(Provider provider) {
		repository.save(provider);
		return "Added provider with id : " + provider.getId();
	}
	
	public List<Provider> getAllProviders() {
		return repository.findAll();
	}

}
