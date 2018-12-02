package com.revature.buyrgames.controllers;

import java.util.List;

import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.buyrgames.model.AppUser;
import com.revature.buyrgames.services.UsersService;
import com.revature.dto.Credential;

@RestController
@RequestMapping("users")
public class UserController {
	@Autowired
	private UsersService usersService;
	
	@PostMapping("login")
	public ResponseEntity<AppUser> findByUsernameAndPassword(@RequestBody Credential credential) {
		
		AppUser user = usersService.findByUsernameAndPassword(credential.getUsername(), credential.getPassword());
		
		if (user != null) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(user, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public int save(@RequestBody AppUser appUser) {
		return usersService.save(appUser);
	}
	
	@PostMapping("update/recent")
	public AppUser updateRecent(@RequestBody AppUser appUser) {
		System.out.println(appUser);
		return usersService.updateRecent(appUser);
	}
	
	@PostMapping("update/address")
	public AppUser updateAddress(@RequestBody AppUser appUser) {
		System.out.println(appUser);
		return usersService.updateAddress(appUser);
	}
	
	@GetMapping("{id}")
	public String username (@PathVariable int id) {
		return usersService.username(id);
	}
	
	@GetMapping("recent/{id}")
	public List<Integer[]> recentlyViewed(@PathVariable int id) {
		return usersService.recentlyViewed(id);
	}
}
