package com.revature.buyrgames.controllers;

import java.util.Collections;
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
	
	@GetMapping("{id}")
	public Game findById(@PathVariable int id) {
		return gs.findById(id);
	}

	@GetMapping("/genre/{genre}")
	public List<Game> findByGenre(@PathVariable String genre) {
		return gs.findByGenre(genre);
	}

	@GetMapping("/platform/{platform}")
	public List<Game> findRandomByPlatform(@PathVariable String platform) {
		List<Game> fullList = gs.findRandomByPlatform(platform);

		
		
		for (int i = fullList.size() - 1; i >2; i--) {
            fullList.remove(i);
        }
		
		return fullList;

	}
	
	@GetMapping("/release/{releaseyear}")
	public List<Game> getGameByYear(@PathVariable String releaseyear){
		return gs.getGameByYear(releaseyear);
	}
	
	@GetMapping("/search/{param}")
	public List<Game> getSearchResults(@PathVariable String param){
		
		return gs.getSearchResults(param);
	}
	
	@GetMapping("/searchRelated/{param}")
	public List<Game> getTopFive(@PathVariable String param){
		List<Game> results = gs.getTopFive(param);
		Collections.shuffle(results);
		for (int i = results.size() - 1; i >4; i--) {
            results.remove(i);
        }
		
		return results;
		
	}
	@GetMapping("/review/{id}")
	public Game findByProductId(@PathVariable int id) {
		return gs.findByProductId(id);
	}
}
