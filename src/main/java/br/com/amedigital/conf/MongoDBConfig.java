package br.com.amedigital.conf;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import br.com.amedigital.document.Planet;
import br.com.amedigital.repository.PlanetRepository;

@EnableMongoRepositories(basePackageClasses = PlanetRepository.class)
@Configuration
public class MongoDBConfig {

	@Bean
	CommandLineRunner commandLineRunner(PlanetRepository planetRepository) {
		return strings -> {
			planetRepository.save(new Planet(1, "Saturno", "Hot", "dry"));
			planetRepository.save(new Planet(2, "Plutao", "Cold", "humid"));
			planetRepository.save(new Planet(3, "Mercurio", "Hot", "rock"));
			planetRepository.save(new Planet(4, "Urano", "Cold", "dry"));
		};
	}

}
