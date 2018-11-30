package com.revature.buyrgames.services;

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
		return usersRepo.findByUsernameAndPassword(username, password);
	}
	
	public int save(AppUser u) {
		usersRepo.save(u);
		return u.getUserId();
	}
	
	public static HttpSession session() {
	    ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
	    return attr.getRequest().getSession(true); // true == allow create
	}
}
