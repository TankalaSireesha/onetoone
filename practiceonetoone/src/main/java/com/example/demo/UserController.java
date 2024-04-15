package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
		@Autowired
		private UserService userService;
		
		@GetMapping("/users")
		public List<User>getAllUsers(){
			return userService.getAllUsers();
		}
		@GetMapping("/users/{id}")
		public User getUserById(@PathVariable Integer id) {
			return userService.getUserById(id);
		}
		
		@PostMapping("/users")
		public User createUser(@RequestBody User user) {
			return userService.createUser(user);
		}
		@PutMapping("/users/{id}")
		public User updteUser(@RequestBody User user) {
			return userService.updateUser(user);
		}
		@DeleteMapping("/users/{id}")
		public void deleteUser(@PathVariable Integer id) {
			userService.delete(id);
		}
}
