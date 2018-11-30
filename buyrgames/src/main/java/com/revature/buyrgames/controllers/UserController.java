package com.revature.buyrgames.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.buyrgames.model.AppUser;
import com.revature.buyrgames.services.UsersService;
import com.revature.dto.Credential;
import com.revature.model.Champion;

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
}
