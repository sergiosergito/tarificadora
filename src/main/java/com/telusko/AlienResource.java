package com.telusko;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {

	@RequestMapping("aliens")
	public List<Alien> getAliens(){
		List<Alien> aliens = new ArrayList<>();
		Alien a1 = new Alien(101,"Navin", 70);
		Alien a2 = new Alien(102, "Priya", 80);
		aliens.add(a1);
		aliens.add(a2);
		return aliens;
	}
}
