package com.tickts.services;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.GenerationType;

@Entity
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	
	private String description;
	
	@SuppressWarnings("unused")
	private class Location {
		int[] coordinates = new int[2];
	}

	@ManyToMany
	private Set<Artist> artists;

	public Event() {
		super();
	}
	
	public Event(String name) {
		super();
		this.name = name; 
	}
	

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Set<Artist> getArtists() {
		return artists;
	}


	public void setArtists(Set<Artist> artists) {
		this.artists = artists;
	}


	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + "]";
	}

}
