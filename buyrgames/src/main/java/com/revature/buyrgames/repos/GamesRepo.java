package com.revature.buyrgames.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.buyrgames.model.Game;

@Repository
public interface GamesRepo extends JpaRepository<Game, Integer> {

	Game findById(int id);
	
	List<Game> findByGenre(String genre);
	
	List<Game> findRandomByPlatform(String platform);
	
	List<Game> getGameByReleaseyear(String releaseyear);
	
	@Query("FROM Game WHERE lower(name) LIKE lower(:query) OR lower(genre) LIKE lower(:query) OR lower(platform) LIKE lower(:query)")
	List<Game> getSearchResults(String query);
	
	@Query("FROM Game WHERE lower(name) LIKE lower(:query) OR lower(genre) LIKE lower(:query) OR lower(platform) LIKE lower(:query)")
	List<Game> getTopFive(String query);
}
