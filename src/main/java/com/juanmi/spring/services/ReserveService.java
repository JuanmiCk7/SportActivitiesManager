package com.juanmi.spring.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanmi.spring.models.Court;
import com.juanmi.spring.models.Reserve;
import com.juanmi.spring.models.User;
import com.juanmi.spring.repositories.ReserveRepository;

@Service
public class ReserveService {
	
	@Autowired
	ReserveRepository repository;
	
	public Reserve insert(Reserve reserve) {
		return repository.save(reserve);
	}
	
	public void delete(long id) {
		repository.deleteById(id);
	}
	
	public void delete(Reserve reserve) {
		repository.delete(reserve);
	}
	
	public Reserve edit(Reserve reserve) {
		return repository.save(reserve);
	}
	
	public Reserve findById(long id) {
		return repository.findFirstById(id);
	}
	
	public Reserve findByName(String name) {
		return repository.findFirstByName(name);
	}
	
	public List<Reserve> findAll() {
		return repository.findAll();
	}
	
	public List<Reserve> findByOwner(User owner) {
		return repository.findByOwner(owner);
	}
	
	public List<Reserve> findByCourt(Court court) {
		return repository.findByCourt(court);
	}
	
	public List<Reserve> findByReservationDateStart(Date dateStart) {
		return repository.findByReservationDateStart(dateStart);
	}
	
	public List<Reserve> findByReservationDateEnd(Date dateEnd) {
		return repository.findByReservationDateEnd(dateEnd);
	}
	
	
	
	
	
}
