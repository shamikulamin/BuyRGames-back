package com.revature.buyrgames.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.buyrgames.model.AppUser;

@Repository
public interface UsersRepo extends JpaRepository<AppUser, Integer>{
	
}
