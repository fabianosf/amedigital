package br.com.amedigital.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Planet {

    @Id
    private Integer id;
    private String name;
    private String climate;
    private String ground;
    
    public Planet() {
    	
    }

	public Planet(Integer id, String name, String climate, String ground) {
		super();
		this.id = id;
		this.name = name;
		this.climate = climate;
		this.ground = ground;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getGround() {
		return ground;
	}

	public void setGround(String ground) {
		this.ground = ground;
	}

     

      
     
}
