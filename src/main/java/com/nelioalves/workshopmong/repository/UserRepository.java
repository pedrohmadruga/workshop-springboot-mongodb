package com.nelioalves.workshopmong.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.workshopmong.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
