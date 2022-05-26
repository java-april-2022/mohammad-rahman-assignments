package com.codingdojo.dojosandninjastaketwo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.dojosandninjastaketwo.models.Dojo;
import com.codingdojo.dojosandninjastaketwo.models.Ninja;

public interface NinaRepository extends CrudRepository<Ninja, Long>{

		List<Ninja> findAll();
		List<Ninja> findAllByDojo(Dojo dojo);
}
