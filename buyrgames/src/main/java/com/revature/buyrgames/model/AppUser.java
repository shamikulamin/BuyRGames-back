package com.revature.buyrgames.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "users_table")
public class AppUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	private String username;
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	private String email;
	private String firstname;
	private String lastname;
	private String address;
	private String zip;
	private String city;
	private String state;
	private String country;
	private int rewardPoints;
	private Integer recentlyViewed1;
	private Integer recentlyViewed2;
	private Integer recentlyViewed3;
	private Integer recentlyViewed4;
	private Integer recentlyViewed5;

	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppUser(int userId, String username, String password, String email, String firstname, String lastname,
			String address, String zip, String city, String state, String country, Integer rewardPoints,
			Integer recentlyViewed1, Integer recentlyViewed2, Integer recentlyViewed3, Integer recentlyViewed4,
			Integer recentlyViewed5) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.country = country;
		this.rewardPoints = rewardPoints;
		this.recentlyViewed1 = recentlyViewed1;
		this.recentlyViewed2 = recentlyViewed2;
		this.recentlyViewed3 = recentlyViewed3;
		this.recentlyViewed4 = recentlyViewed4;
		this.recentlyViewed5 = recentlyViewed5;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public Integer getRecentlyViewed1() {
		return recentlyViewed1;
	}

	public void setRecentlyViewed1(Integer recentlyViewed1) {
		this.recentlyViewed1 = recentlyViewed1;
	}

	public Integer getRecentlyViewed2() {
		return recentlyViewed2;
	}

	public void setRecentlyViewed2(Integer recentlyViewed2) {
		this.recentlyViewed2 = recentlyViewed2;
	}

	public Integer getRecentlyViewed3() {
		return recentlyViewed3;
	}

	public void setRecentlyViewed3(Integer recentlyViewed3) {
		this.recentlyViewed3 = recentlyViewed3;
	}

	public Integer getRecentlyViewed4() {
		return recentlyViewed4;
	}

	public void setRecentlyViewed4(Integer recentlyViewed4) {
		this.recentlyViewed4 = recentlyViewed4;
	}

	public Integer getRecentlyViewed5() {
		return recentlyViewed5;
	}

	public void setRecentlyViewed5(Integer recentlyViewed5) {
		this.recentlyViewed5 = recentlyViewed5;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((recentlyViewed1 == null) ? 0 : recentlyViewed1.hashCode());
		result = prime * result + ((recentlyViewed2 == null) ? 0 : recentlyViewed2.hashCode());
		result = prime * result + ((recentlyViewed3 == null) ? 0 : recentlyViewed3.hashCode());
		result = prime * result + ((recentlyViewed4 == null) ? 0 : recentlyViewed4.hashCode());
		result = prime * result + ((recentlyViewed5 == null) ? 0 : recentlyViewed5.hashCode());
		result = prime * result + rewardPoints;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + userId;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
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
		AppUser other = (AppUser) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (recentlyViewed1 == null) {
			if (other.recentlyViewed1 != null)
				return false;
		} else if (!recentlyViewed1.equals(other.recentlyViewed1))
			return false;
		if (recentlyViewed2 == null) {
			if (other.recentlyViewed2 != null)
				return false;
		} else if (!recentlyViewed2.equals(other.recentlyViewed2))
			return false;
		if (recentlyViewed3 == null) {
			if (other.recentlyViewed3 != null)
				return false;
		} else if (!recentlyViewed3.equals(other.recentlyViewed3))
			return false;
		if (recentlyViewed4 == null) {
			if (other.recentlyViewed4 != null)
				return false;
		} else if (!recentlyViewed4.equals(other.recentlyViewed4))
			return false;
		if (recentlyViewed5 == null) {
			if (other.recentlyViewed5 != null)
				return false;
		} else if (!recentlyViewed5.equals(other.recentlyViewed5))
			return false;
		if (rewardPoints != other.rewardPoints) {
			return false;
		} 
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (userId != other.userId)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AppUser [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", zip=" + zip
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", rewardPoints=" + rewardPoints
				+ ", recentlyViewed1=" + recentlyViewed1 + ", recentlyViewed2=" + recentlyViewed2 + ", recentlyViewed3="
				+ recentlyViewed3 + ", recentlyViewed4=" + recentlyViewed4 + ", recentlyViewed5=" + recentlyViewed5
				+ "]";
	}


	
}
