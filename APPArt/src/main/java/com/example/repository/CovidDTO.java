package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Covid;

@Repository
public interface CovidDTO extends CrudRepository<Covid, Integer>{

}
