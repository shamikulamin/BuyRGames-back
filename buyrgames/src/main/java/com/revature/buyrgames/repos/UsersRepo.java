package com.revature.buyrgames.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.buyrgames.model.AppUser;

@Repository
public interface UsersRepo extends JpaRepository<AppUser, Integer>{

	
	@Query(value = "SELECT username FROM buyrgames.users_table WHERE user_id = :id", nativeQuery = true)
	String username (int id);

	AppUser findByUsernameAndPassword(String username, String password);

}
