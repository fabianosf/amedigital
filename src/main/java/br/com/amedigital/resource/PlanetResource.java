package br.com.amedigital.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.amedigital.document.Planet;
import br.com.amedigital.repository.PlanetRepository;

@RestController
@RequestMapping("/planet")
public class PlanetResource {

	private PlanetRepository planetRepository;

	public PlanetResource(PlanetRepository planetRepository) {
		this.planetRepository = planetRepository;
	}

	// list all planets
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Planet> getAllPlanets() {
		return planetRepository.findAll();
	}

	// get planet by id
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Planet getPetById(@PathVariable("id") Integer id) {
		return planetRepository.findById(id);
	}

	// get planet by name
	@RequestMapping(value = "/search/{name}", method = RequestMethod.GET)
	public Planet getPetByName(@PathVariable String name) {
		return planetRepository.findByName(name);
	}

	// update planet by id
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public void updatePlanet(@PathVariable("id") Integer id, @Valid @RequestBody Planet planet) {
		planet.setId(planet.getId());
		planetRepository.save(planet);
	}

	// create planet
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Planet createPlanet(@Valid @RequestBody Planet planet) {
		planet.setId(planet.getId());
		planetRepository.save(planet);
		return planet;
	}

	// delete planet by id
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deletePlanet(@PathVariable Integer id) {
		planetRepository.delete(planetRepository.findById(id));
	}

}
