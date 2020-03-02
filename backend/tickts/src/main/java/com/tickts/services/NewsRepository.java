package com.tickts.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tickts.entities.New;

public interface NewsRepository extends JpaRepository<New, Long>{
	
	List<New> findAll();
	Optional<New> findOneByTitle(String title);

}