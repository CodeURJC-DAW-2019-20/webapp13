package com.tickts.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
//import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.tickts.services.*;

@SuppressWarnings("unused")
@Controller
public class WebController {

	@Autowired
	private EventService eventService;
	
	@GetMapping("/home")
	public String Init() {
	    return "event";
	}
	
	@GetMapping("/")
	public String showEvents(Model model, @PageableDefault(size=4) Pageable page) {
		Page<Event> events = eventService.findAll(page);
		model.addAttribute("events", eventService.findAll(page));
		model.addAttribute("showNextEvents", !events.isLast());
		model.addAttribute("showPreviousEvents", !events.isFirst());
		model.addAttribute("nextEventPage", events.getNumber()+1);
		model.addAttribute("previousEventPage", events.getNumber()-1);
		return "event";
	}
	
	
	@GetMapping("/event/{id}")
	public String showBook(Model model, @PathVariable long id) {
		
		Optional<Event> event = eventService.findOne(id);

		if(event.isPresent()) {
			model.addAttribute("events", event.get());
		}

		return "event";
	}
	
}