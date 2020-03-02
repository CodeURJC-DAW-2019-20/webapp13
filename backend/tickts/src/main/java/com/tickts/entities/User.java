package com.tickts.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;

	private String name;

	private String passwordHash;
	@ElementCollection(fetch = FetchType.EAGER)
	private List<String> roles;

	public User() {
	
	}
	public User(String name, String password, String roles) {
		super();
		this.name = name;
		this.passwordHash = new BCryptPasswordEncoder().encode(password);
		this.roles = new ArrayList<>(Arrays.asList(roles));
	}
	public User(String name, String password, List<String> roles) {
		super();
		this.name = name;
		this.passwordHash = new BCryptPasswordEncoder().encode(password);
		this.roles = roles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public void setRol(String rol) {
		this.roles.add(rol);
	}
	public void setRolDefault() {
		this.roles.add("ROLE_USER");
	}
}
