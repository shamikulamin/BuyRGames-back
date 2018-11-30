package com.revature.buyrgames.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "review_table")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "review_id")
	private int reviewId;
	private int userId;
	@Column(name = "product_id")
	private int productId;
	@Column(name = "user_rating")
	private int userRating;
	private String review;
	
	@OneToOne
	@JoinColumn(name = "userId", insertable = false, updatable = false)
	private AppUser user;

	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Review(int reviewId, int userId, int productId, int userRating, String review, AppUser user) {
		super();
		this.reviewId = reviewId;
		this.userId = userId;
		this.productId = productId;
		this.userRating = userRating;
		this.review = review;
		this.user = user;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getUserRating() {
		return userRating;
	}

	public void setUserRating(int userRating) {
		this.userRating = userRating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public AppUser getUser() {
		return user;
	}

	public void setUser(AppUser user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", userId=" + userId + ", productId=" + productId + ", userRating="
				+ userRating + ", review=" + review + ", user=" + user + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + productId;
		result = prime * result + ((review == null) ? 0 : review.hashCode());
		result = prime * result + reviewId;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + userId;
		result = prime * result + userRating;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		if (productId != other.productId)
			return false;
		if (review == null) {
			if (other.review != null)
				return false;
		} else if (!review.equals(other.review))
			return false;
		if (reviewId != other.reviewId)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (userId != other.userId)
			return false;
		if (userRating != other.userRating)
			return false;
		return true;
	}
	
	
	
}
