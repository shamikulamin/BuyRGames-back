package com.revature.buyrgames.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.revature.buyrgames.model.AppUser;
import com.revature.buyrgames.services.UsersService;
import com.revature.dto.Credential;

@CrossOrigin(origins = "http://buyrgames.s3-website.us-east-2.amazonaws.com")
@RestController
@RequestMapping("users")
public class UserController {
	@Autowired
	private UsersService usersService;
	
	@PostMapping("login")
	@CrossOrigin(origins = "http://buyrgames.s3-website.us-east-2.amazonaws.com")
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
	@CrossOrigin(origins = "http://buyrgames.s3-website.us-east-2.amazonaws.com")
	public int save(@RequestBody AppUser appUser) {
		return usersService.save(appUser);
	}
	
	@PostMapping("update/recent")
	@CrossOrigin(origins = "http://buyrgames.s3-website.us-east-2.amazonaws.com")
	public AppUser updateRecent(@RequestBody AppUser appUser) {
		if (session().getAttribute("id") != null) {
			return usersService.updateRecent(appUser);
		} else {
			return null;
		}
	}
	
	@PostMapping("update/address")
	@CrossOrigin(origins = "http://buyrgames.s3-website.us-east-2.amazonaws.com")
	public AppUser updateAddress(@RequestBody AppUser appUser) {
		if (session().getAttribute("id") != null) {
			return usersService.updateAddress(appUser);
		} else {
			return null;
		}
	}
	
	@PostMapping("update/profile")
	public AppUser updateProfile(@RequestBody AppUser appUser) {
		if (session().getAttribute("id") != null) {
			return usersService.updateProfile(appUser);
		} else {
			return null;
		}
	}
	
	@GetMapping("{id}")
	@CrossOrigin(origins = "http://buyrgames.s3-website.us-east-2.amazonaws.com")
	public String username (@PathVariable int id) {
		if (session().getAttribute("id") != null) {
			return usersService.username(id);
		} else {
			return null;
		}
	}
	
	@GetMapping("recent/{id}")
	@CrossOrigin(origins = "http://buyrgames.s3-website.us-east-2.amazonaws.com")
	public List<Integer[]> recentlyViewed(@PathVariable int id) {
		if (session().getAttribute("id") != null) {
			return usersService.recentlyViewed(id);
		} else {
			return null;
		}
	}
	
	public static HttpSession session() {
	    ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
	    return attr.getRequest().getSession(true); // true == allow create
	}
}
