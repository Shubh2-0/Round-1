package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.masai.exception.UserException;
import com.masai.model.User;
import com.masai.service.UserService;

@RestController
public class UserController {

	
	@Autowired
	private UserService userService;
	
	
	 @GetMapping("users/{email}")
	   public User getUserHandler(@PathVariable ("email") String email) throws UserException {
			
			return userService.getUserByEmil(email);
			
		}
	
	
	
	@PostMapping("/users/add")
	public User addUserHandler(@RequestBody User user) throws UserException {
		
		return userService.addUser(user);
		
	}
	

   @DeleteMapping("users/{email}")
   public User deleteUserHandler(@PathVariable ("email") String email) throws UserException {
		
		return userService.deleteUser(email);
		
	}
	
	
   
   @PatchMapping("users/{email}")
   public User updateUserHandler(@PathVariable ("email") String email, @RequestBody User user) throws UserException {
		
		return userService.updateUser(user,email);
		
	}
	
   
   
	
}
