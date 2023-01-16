package com.example.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.Covid;

@Repository
public interface CovidInterface {
	
	public List<Covid> getCovidData();

}
