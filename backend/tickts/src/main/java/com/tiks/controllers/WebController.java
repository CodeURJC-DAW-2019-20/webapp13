package com.tiks.controllers;

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

import com.tickts.entities.User;
import com.tickts.services.UserRepository;;

@Controller
public class WebController {
	
	@Autowired
	private UserRepository userRepository;
	
	

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/login")
    public String login() {
    	return "login";
    }
    
    @GetMapping("/loginerror")
    public String loginerror() {
    	return "loginerror";
    }
    
    @GetMapping("/admin")
    public String admin() {
    	return "admin";
    }
    @GetMapping("/register")
    public String test(Model model) {
    	User user = new User();
    	model.addAttribute("user", user);
    	return "register";
    }
    /* new user*/
    @PostMapping("/signin")
	public String nuevoUsuario(@ModelAttribute User user) {
    	List<String> l= new LinkedList<String>();
    	l.add("ROLE_USER");
    	User nuevo  = new User(user.getName(),user.getPasswordHash(),l); 
    	userRepository.save(nuevo);
		return "usuario_guardado";

	}
}
