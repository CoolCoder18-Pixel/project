package com.airlinereservation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airlinereservation.entity.User;
/**
 * @author Manoranjan Sahoo
 * @since2024 aug
 * {@summary:  Airline Reservation project}
 * @Mobile:8658664378
 */
@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	
	User findByEmailAndPassword(String emailId, String password); 
	User findByEmailAndPasswordAndRoles(String emailId, String password, String role); 
	User findByEmailAndRoles(String emailId, String role);
	User findByEmail(String emailId);
	List<User> findByRolesAndStatus(String role, String status);
	List<User> findByRoles(String role);

}
