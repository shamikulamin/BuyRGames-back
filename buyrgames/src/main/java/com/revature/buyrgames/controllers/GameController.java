package com.revature.buyrgames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.buyrgames.model.Game;
import com.revature.buyrgames.services.GamesService;

@RestController
@RequestMapping("games")
public class GameController {

	private GamesService gs;
	
	public GameController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public GameController(GamesService gs) {
		super();
		this.gs = gs;
	}
	
	@GetMapping("{genre}")
	public List<Game> findByGenre(@PathVariable String genre){
		return gs.findByGenre(genre);
	}
}
