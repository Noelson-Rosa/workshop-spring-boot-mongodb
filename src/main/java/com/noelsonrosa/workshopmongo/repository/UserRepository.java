package com.noelsonrosa.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.noelsonrosa.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	//userReposiroty.saveAll(Arrays.asList("");
}
