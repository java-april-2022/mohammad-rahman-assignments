package com.codingdojo.dojosandninjastaketwo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjastaketwo.models.Dojo;
import com.codingdojo.dojosandninjastaketwo.repositories.DojoRepository;

@Service
public class DojoService {

	private final DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> dojo = dojoRepository.findById(id);
		if(dojo.isPresent()) {
			return dojo.get();
		} else {
			return null;
		}
	}
	
	public List<Dojo> allDojo() {
		return dojoRepository.findAll();
	}
	
}
