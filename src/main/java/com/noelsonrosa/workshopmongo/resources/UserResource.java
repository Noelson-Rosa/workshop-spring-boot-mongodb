package com.noelsonrosa.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.noelsonrosa.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User claudiane = new User("1", "Claudiane Rosa", "claudiane@gmail.com");
		User  noelson = new User("2", "Noelson Rosa", "noelson@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(claudiane,noelson));
		return ResponseEntity.ok().body(list);
	}

}
