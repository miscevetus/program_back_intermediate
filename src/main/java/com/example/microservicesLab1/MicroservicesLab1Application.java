package com.example.microservicesLab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.*;

@SpringBootApplication
public class MicroservicesLab1Application {

	@Autowired
	TeamRepository teamRepository;

	@PostConstruct
	public void init(){
		List<Team> list = new ArrayList<>();

		Set<Player> set = new HashSet<>();
		set.add(new Player("Big Easy", "Showman"));
		set.add(new Player("Buckets", "Guard"));
		set.add(new Player("Dizzy", "Guard"));

		list.add(new Team("Harlem", "Globetrotters", set));

		teamRepository.saveAll(list);
	}


	public static void main(String[] args) {
		SpringApplication.run(MicroservicesLab1Application.class, args);
	}

}
