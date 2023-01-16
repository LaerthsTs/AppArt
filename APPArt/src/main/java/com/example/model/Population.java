package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Population {

	@Id
	@GeneratedValue
	private int id;
	private String regionalUnitId;
	private String regionalUnit;
	private String population;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegionalUnitId() {
		return regionalUnitId;
	}
	public void setRegionalUnitId(String regionalUnitId) {
		this.regionalUnitId = regionalUnitId;
	}
	public String getRegionalUnit() {
		return regionalUnit;
	}
	public void setRegionalUnit(String regionalUnit) {
		this.regionalUnit = regionalUnit;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	
	
	public Population(int id, String regionalUnitId, String regionalUnit, String population) {
		super();
		this.id = id;
		this.regionalUnitId = regionalUnitId;
		this.regionalUnit = regionalUnit;
		this.population = population;
	}
	
	
	public Population() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Population [id=" + id + ", regionalUnitId=" + regionalUnitId + ", regionalUnit=" + regionalUnit
				+ ", population=" + population + "]";
	}
	
	

}
