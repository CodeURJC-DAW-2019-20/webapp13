package com.tickts.services;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class WebController {
	
	@Autowired
	private UserRepository userRepository;
	
	

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/signin")
    public String signin() {
        return "login";
    }
    
    @GetMapping("/loginerror")
    public String signinerror() {
    	return "login";
    }
    
    @GetMapping("/register")
    public String register(Model model) {
    	User user = new User();
    	model.addAttribute("user", user);
    	return "register";
    }
    @PostMapping("/signup")
    public String signup(@ModelAttribute User user) {
    	List<String> l= new LinkedList<String>();
    	l.add("ROLE_USER");
    	User nuevo  = new User(user.getName(),user.getUsername(),user.getEmail(),user.getPasswordHash(),l); 
    	userRepository.save(nuevo);
    	return "index";
    }
    
}
