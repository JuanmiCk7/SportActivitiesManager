package com.juanmi.spring.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juanmi.spring.models.Court;
import com.juanmi.spring.models.Reserve;
import com.juanmi.spring.models.User;

public interface ReserveRepository extends JpaRepository<Reserve, Long> {
	
	Reserve findFirstById(long id);
	Reserve findFirstByName(String name);
	List<Reserve> findByOwner(User owner);
	List<Reserve> findByCourt(Court court);
	List<Reserve> findByReservationDateStart(Date dateStart);
	List<Reserve> findByReservationDateEnd(Date dateStart);
	
}
