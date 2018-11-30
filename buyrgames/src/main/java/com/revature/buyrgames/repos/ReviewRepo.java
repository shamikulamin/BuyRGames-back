package com.revature.buyrgames.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.buyrgames.model.Game;
import com.revature.buyrgames.model.Review;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Integer> {
	
	List<Review> findByProductId(int id);
	
}
