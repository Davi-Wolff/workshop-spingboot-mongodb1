package com.daviwolff.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.daviwolff.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{
}
