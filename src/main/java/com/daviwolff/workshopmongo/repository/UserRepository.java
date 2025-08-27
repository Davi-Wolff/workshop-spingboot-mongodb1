package com.daviwolff.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.daviwolff.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User,String>{

}
