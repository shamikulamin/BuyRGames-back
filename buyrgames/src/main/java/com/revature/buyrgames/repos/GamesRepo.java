package com.revature.buyrgames.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.buyrgames.model.Game;

@Repository
public interface GamesRepo extends JpaRepository<Game, Integer> {
	List<Game> findByGenre(String genre);
	
	List<Game> findRandomByPlatform(String platform);
}
