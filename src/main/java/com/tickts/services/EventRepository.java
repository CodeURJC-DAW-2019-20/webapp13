package com.tickts.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long>{
	
	List<Event> findAll();
	Optional<Event> findOneByTitle(String title);

}
