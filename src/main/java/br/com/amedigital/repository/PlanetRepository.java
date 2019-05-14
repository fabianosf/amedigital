package br.com.amedigital.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.amedigital.document.Planet;

public interface PlanetRepository extends MongoRepository<Planet, Integer> {
	
	public Planet findById(Integer id);
	public Planet findByName(String name);
}
