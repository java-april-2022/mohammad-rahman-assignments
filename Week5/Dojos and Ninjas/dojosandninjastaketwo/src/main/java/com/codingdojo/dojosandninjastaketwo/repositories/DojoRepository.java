package com.codingdojo.dojosandninjastaketwo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.dojosandninjastaketwo.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long>{

	List<Dojo> findAll();
}
