package com.tickts.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class ArtistService {
	
	@Autowired
	private ArtistRepository repository;

	public Optional<Artist> findOne(long id) {
		return repository.findById(id);
	}

	public void delete(long id) {
		repository.deleteById(id);
	}
	
    public List<Artist> findAll(){
        return repository.findAll();
    }
    
    public Page<Artist> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }
    
    public Optional<Artist> findOneByTitle(String title) {
		return repository.findOneByTitle(title);
	}

}



/* This service will be used to include features to controller(s)
 */
