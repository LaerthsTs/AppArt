package com.example.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.Population;

@Repository
public interface PopulationInterface {
	
	public List<Population> getPopulation();

}
