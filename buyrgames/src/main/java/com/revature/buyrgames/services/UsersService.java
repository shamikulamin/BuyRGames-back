package com.revature.buyrgames.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.buyrgames.model.AppUser;
import com.revature.buyrgames.repos.UsersRepo;

@Service
public class UsersService {
	@Autowired
	private UsersRepo usersRepo;
	
	public int save(AppUser u) {
		usersRepo.save(u);
		return u.getUserId();
	}
}
