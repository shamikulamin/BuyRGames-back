package com.revature.buyrgames.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "product_table")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int id;
	private String name;
	private String platform;
	private int release_year;
	private String genre;
	private String publisher;
	private String developer;
	private int critic_score;
	private double user_rating_average;
	private double price;
	private String product_image_url;
	private String esrb_rating;

	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Game(int id, String name, String platform, int release_year, String genre, String publisher, String developer,
			int critic_score, double user_rating_average, double price, String product_image_url, String esrb_rating) {
		super();
		this.id = id;
		this.name = name;
		this.platform = platform;
		this.release_year = release_year;
		this.genre = genre;
		this.publisher = publisher;
		this.developer = developer;
		this.critic_score = critic_score;
		this.user_rating_average = user_rating_average;
		this.price = price;
		this.product_image_url = product_image_url;
		this.esrb_rating = esrb_rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public int getRelease_year() {
		return release_year;
	}

	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public int getCritic_score() {
		return critic_score;
	}

	public void setCritic_score(int critic_score) {
		this.critic_score = critic_score;
	}

	public double getUser_rating_average() {
		return user_rating_average;
	}

	public void setUser_rating_average(double user_rating_average) {
		this.user_rating_average = user_rating_average;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProduct_image_url() {
		return product_image_url;
	}

	public void setProduct_image_url(String product_image_url) {
		this.product_image_url = product_image_url;
	}

	public String getEsrb_rating() {
		return esrb_rating;
	}

	public void setEsrb_rating(String esrb_rating) {
		this.esrb_rating = esrb_rating;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", platform=" + platform + ", release_year=" + release_year + ", genre=" + genre
				+ ", publisher=" + publisher + ", developer=" + developer + ", critic_score=" + critic_score
				+ ", user_rating_average=" + user_rating_average + ", price=" + price + ", product_image_url="
				+ product_image_url + ", esrb_rating=" + esrb_rating + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + critic_score;
		result = prime * result + ((developer == null) ? 0 : developer.hashCode());
		result = prime * result + ((esrb_rating == null) ? 0 : esrb_rating.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + id;
		result = prime * result + ((platform == null) ? 0 : platform.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((product_image_url == null) ? 0 : product_image_url.hashCode());
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + release_year;
		temp = Double.doubleToLongBits(user_rating_average);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Game other = (Game) obj;
		if (critic_score != other.critic_score)
			return false;
		if (developer == null) {
			if (other.developer != null)
				return false;
		} else if (!developer.equals(other.developer))
			return false;
		if (esrb_rating == null) {
			if (other.esrb_rating != null)
				return false;
		} else if (!esrb_rating.equals(other.esrb_rating))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (id != other.id)
			return false;
		if (platform == null) {
			if (other.platform != null)
				return false;
		} else if (!platform.equals(other.platform))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (product_image_url == null) {
			if (other.product_image_url != null)
				return false;
		} else if (!product_image_url.equals(other.product_image_url))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (release_year != other.release_year)
			return false;
		if (Double.doubleToLongBits(user_rating_average) != Double.doubleToLongBits(other.user_rating_average))
			return false;
		return true;
	}

}
