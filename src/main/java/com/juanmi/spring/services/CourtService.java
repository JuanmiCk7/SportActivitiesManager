package com.juanmi.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanmi.spring.models.Court;
import com.juanmi.spring.repositories.CourtRepository;

@Service
public class CourtService {
	
	@Autowired
	CourtRepository repository;
	
	public Court insert(Court court) {
		return repository.save(court);
	}
	
	public void delete(long id) {
		repository.deleteById(id);
	}
	
	public void delete(Court court) {
		repository.delete(court);
	}
	
	public Court edit(Court court) {
		return repository.save(court);
	}
	
	public Court findById(long id) {
		return repository.findFirstById(id);
	}
	
	public Court findByName(String name) {
		return repository.findFirstByName(name);
	}
		
	public List<Court> findAll() {
		return repository.findAll();
	}

}
