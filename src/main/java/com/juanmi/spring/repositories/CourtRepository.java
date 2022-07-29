package com.juanmi.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juanmi.spring.models.Court;

public interface CourtRepository extends JpaRepository<Court, Long> {
	
	Court findFirstByName(String name);
	Court findFirstById(long id);

}
