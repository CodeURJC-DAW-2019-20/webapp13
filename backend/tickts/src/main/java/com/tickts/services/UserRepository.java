package com.tickts.services;

import org.springframework.data.repository.CrudRepository;

import com.tickts.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByName(String name);

}
