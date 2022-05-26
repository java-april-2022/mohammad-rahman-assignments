package com.codingdojo.dojosandninjastaketwo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjastaketwo.models.Dojo;
import com.codingdojo.dojosandninjastaketwo.models.Ninja;
import com.codingdojo.dojosandninjastaketwo.repositories.NinaRepository;

@Service
public class NinjaService {

private final NinaRepository ninjaRepository;
    
    public NinjaService(NinaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }
    
    public List<Ninja> allNinja() {
    	return ninjaRepository.findAll();
    }
   
    public Ninja createNinja(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }
    
    public Ninja findNinja(Long id) {
        Optional<Ninja> ninja = ninjaRepository.findById(id);
        if(ninja.isPresent()) {
            return ninja.get();
        } else {
            return null;
        }
    }
    
    public List<Ninja> findNinjaByDojo(Dojo dojo) {
    	return ninjaRepository.findAllByDojo(dojo);
    }
	
	
}
