package com.tickts.services;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DatabaseSandbox {
	@Autowired
    private UserRepository userRepository;
	
	@Autowired
	private EventRepository eventRepository;
	
	@Autowired
	private ArtistRepository artistRepository;
	
	@PostConstruct
	public void init() {
		userRepository.save(new User("juanma","user","juanma@gmail.com" ,"pass", "ROLE_USER"));
		userRepository.save(new User("Pedro de la hoz","admin","admin@gmail.com", "adminpass", "ROLE_ADMIN"));
		
		Artist a1 = new Artist("artist1");
		Artist a2 = new Artist("artist2");
		Artist a3 = new Artist("artist3");
		
		artistRepository.save(a1);
		artistRepository.save(a2);
		artistRepository.save(a3);
		
		Event e1 = new Event("event1");
		Event e2 = new Event("event2");
		Event e3 = new Event("event3");

		eventRepository.save(e1);
		eventRepository.save(e2);
		eventRepository.save(e3);
		

		
		}

}
