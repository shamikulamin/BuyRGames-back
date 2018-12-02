package com.revature.buyrgames.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.buyrgames.model.AppUser;

@Repository
public interface UsersRepo extends JpaRepository<AppUser, Integer>{

	
	@Query(value = "SELECT username FROM buyrgames.users_table WHERE user_id = :id", nativeQuery = true)
	String username (int id);
	
	@Query(value = "SELECT recently_viewed1, recently_viewed2, recently_viewed3, recently_viewed4, recently_viewed5 FROM buyrgames.users_table WHERE user_id = :id", nativeQuery = true)
	List<Integer[]> recentlyViewed(int id);

	AppUser findByUsernameAndPassword(String username, String password);

}
