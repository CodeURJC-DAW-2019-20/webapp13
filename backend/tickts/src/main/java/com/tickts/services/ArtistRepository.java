package com.tickts.services;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tickts.entities.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long>{

	List<Artist> findAll();
	Optional<Artist> findOneByTitle(String title);
}
