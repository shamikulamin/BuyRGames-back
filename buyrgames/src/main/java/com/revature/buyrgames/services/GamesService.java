package com.revature.buyrgames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.buyrgames.model.Game;
import com.revature.buyrgames.repos.GamesRepo;

@Service
public class GamesService {

	@Autowired
	private GamesRepo gameRepo;
	
	public List<Game> findByGenre(String genre) {
		return gameRepo.findByGenre(genre);
	}
	
	public List<Game> findRandomByPlatform(String platform){
		return gameRepo.findRandomByPlatform(platform);
	}
	
	public List<Game> getGameByYear(String releaseyear){
		return gameRepo.getGameByReleaseyear(releaseyear);
	}
	public List<Game> getSearchResults(String query){
		return gameRepo.getSearchResults("%"+query+"%");
	}
	public List<Game> getTopFive(String query){
		return gameRepo.getTopFive("%"+query+"%");
	}
	
	public Game findByProductId(int id) {
		return gameRepo.findById(id);
	}
}
