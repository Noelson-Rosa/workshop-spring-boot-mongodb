package com.noelsonrosa.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.noelsonrosa.workshopmongo.domain.User;
import com.noelsonrosa.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userReposiroty;
	
	@Override
	public void run(String... args) throws Exception {
	
		userReposiroty.deleteAll();
		
		User claudiane = new User(null, "claudiane", "claudiane@gmail.com");
		User noelson = new User(null, "noelson rosa", "noelson.nr@gmail.com");
		User dalila = new User(null, "dalila", "dada@gmail.com");
		
		userReposiroty.saveAll(Arrays.asList(claudiane, noelson , dalila));
		
	}

}
