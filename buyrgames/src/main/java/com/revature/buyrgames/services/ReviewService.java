package com.revature.buyrgames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.buyrgames.model.Review;
import com.revature.buyrgames.repos.ReviewRepo;


@Service
public class ReviewService {

	@Autowired
	private ReviewRepo reviewRepo;
	
	public List<Review> findByProductId(int id){
		return reviewRepo.findByProductId(id);
	}
}
