package com.tickts.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<New, Long>{
	
	List<New> findAll();


}