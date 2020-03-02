package com.example.demo;

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
	public List<User> users = new ArrayList<>();
	
	@Autowired
	private UserRepository userRepository;
/*
    @GetMapping("/")
    public String index() {
        return "index";
    }
*/
    @GetMapping("/login")
    public String login() {
    	return "login";
    }
    
    @GetMapping("/loginerror")
    public String loginerror() {
    	return "loginerror";
    }

    @GetMapping("/home")
    public String home(Model model, HttpServletRequest request) {
    	User user = userRepository.findByName(request.getUserPrincipal().getName());
    	
    	model.addAttribute("admin", request.isUserInRole("ADMIN"));
    	model.addAttribute("username", user.getName());
    	
    	return "home";
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
