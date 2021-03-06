package com.revature.buyrgames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.buyrgames.model.Review;
import com.revature.buyrgames.services.ReviewService;

@CrossOrigin(origins = "http://buyrgames.s3-website.us-east-2.amazonaws.com")
@RestController
@RequestMapping("reviews")
public class ReviewController {

	private ReviewService rs;

	public ReviewController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public ReviewController(ReviewService rs) {
		super();
		this.rs = rs;
	}
	
	@GetMapping("{id}")
	@CrossOrigin(origins = "http://buyrgames.s3-website.us-east-2.amazonaws.com")
	public List<Review> findByProductId(@PathVariable int id){
		return rs.findByProductId(id);
	}
	
	@PostMapping
	@CrossOrigin(origins = "http://buyrgames.s3-website.us-east-2.amazonaws.com")
	public int save(@RequestBody Review r) {
		return rs.save(r);
	}
}
