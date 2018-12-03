package com.revature.buyrgames.services;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.revature.buyrgames.model.AppUser;
import com.revature.buyrgames.repos.UsersRepo;

@Service
public class UsersService {
	@Autowired
	private UsersRepo usersRepo;
	
	public AppUser findByUsernameAndPassword(String username, String password) {
		AppUser user = usersRepo.findByUsernameAndPassword(username, password);
		if (user != null) {
			session().setAttribute("id", user.getUserId());
		}
		return user;
	}
	
	public int save(AppUser u) {
		HttpSession session = session();
		usersRepo.save(u);
		return u.getUserId();
	}
	
	public AppUser updateRecent(AppUser u) {
		AppUser tempAppUser = usersRepo.findById(u.getUserId()).get();
		tempAppUser.setRecentlyViewed1(u.getRecentlyViewed1());
		tempAppUser.setRecentlyViewed2(u.getRecentlyViewed2());
		tempAppUser.setRecentlyViewed3(u.getRecentlyViewed3());
		tempAppUser.setRecentlyViewed4(u.getRecentlyViewed4());
		tempAppUser.setRecentlyViewed5(u.getRecentlyViewed5());
		usersRepo.save(tempAppUser);
		return tempAppUser;
	}
	
	public AppUser updateAddress(AppUser u) {
		AppUser tempAppUser = usersRepo.findById(u.getUserId()).get();
		tempAppUser.setFirstname(u.getFirstname());
		tempAppUser.setLastname(u.getLastname());
		tempAppUser.setAddress(u.getAddress());
		tempAppUser.setZip(u.getZip());
		tempAppUser.setCity(u.getCity());
		tempAppUser.setState(u.getState());
		tempAppUser.setCountry(u.getCountry());
		usersRepo.save(tempAppUser);
		return tempAppUser;
	}
	
	public AppUser updateProfile(AppUser u) {
		AppUser tempAppUser = usersRepo.findById(u.getUserId()).get();
		if (u.getUsername() != null) {
			tempAppUser.setUsername(u.getUsername());
		} else if (u.getPassword() != null) {
			tempAppUser.setPassword(u.getPassword());
		} else if (u.getEmail() != null) {
			tempAppUser.setEmail(u.getEmail());
		}
		usersRepo.save(tempAppUser);
		return tempAppUser;
	}
	
	public String username (int id) {
		return usersRepo.username(id);
	}
	
	public List<Integer[]> recentlyViewed(int id) {
		return usersRepo.recentlyViewed(id);
	}
	
	public static HttpSession session() {
	    ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
	    return attr.getRequest().getSession(true); // true == allow create
	}
}
