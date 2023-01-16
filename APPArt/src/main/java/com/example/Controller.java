package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Covid;
import com.example.model.Population;
import com.example.service.CovidService;
import com.example.service.PopulationService;

@RestController
public class Controller {
	
	@Autowired
	private CovidService cs;
	@Autowired
	private PopulationService ps;
	
	
	@RequestMapping("/feedCovidWithData")
	public void setDataInDB() {
		cs.saveCovidData();
	}
	
	@RequestMapping("/feedPoputlationWithData")
	public void setPopulationDataInDB() {
		ps.savePopulationData();
	}
	
	@GetMapping("/covid")
	public List<Covid> getCovidData(){
		
		return this.cs.getCovidData();
		
	}
	
	@GetMapping("/population")
	public List<Population> getPopulation(){
		
		return this.ps.getPopulation();
		
	}

}
