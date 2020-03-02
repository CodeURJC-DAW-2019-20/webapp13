package com.tickts.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class EventService {
	
	@Autowired
	private EventRepository repository;

	public Optional<Event> findOne(long id) {
		return repository.findById(id);
	}

	public void delete(long id) {
		repository.deleteById(id);
	}
	
    public List<Event> findAll(){
        return repository.findAll();
    }
    
    public Page<Event> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }
    



}
