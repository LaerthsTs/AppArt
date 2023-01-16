package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Population;

@Repository
public interface PopulationDTO extends CrudRepository<Population, Integer>{

}
