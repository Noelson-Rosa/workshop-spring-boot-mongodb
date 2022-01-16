package com.noelsonrosa.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.noelsonrosa.workshopmongo.domain.Post;
import com.noelsonrosa.workshopmongo.domain.User;
import com.noelsonrosa.workshopmongo.repository.PostRepository;
import com.noelsonrosa.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userReposiroty;


	@Autowired
	private PostRepository postReposiroty;

	@Override
	public void run(String... arg0) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		userReposiroty.deleteAll();
		postReposiroty.deleteAll();

		User claudiane = new User(null, "claudiane", "claudiane@gmail.com");
		User noelson = new User(null, "noelson", "noelson.nr@gmail.com");
		User dalila = new User(null, "dalila", "dalila@gmail.com");

		Post post1 = new Post(null, sdf.parse("21/03/2022"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", claudiane);
		Post post2 = new Post(null, sdf.parse("23/03/2022"), "Bom dia", "Acordei feliz hoje!", claudiane);

		userReposiroty.saveAll(Arrays.asList(claudiane, noelson, dalila));
		postReposiroty.saveAll(Arrays.asList(post1, post2));
	}

}