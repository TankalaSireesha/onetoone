package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
		@Autowired
		private UserRepository userRepository;
		
		public List<User>getAllUsers(){
			return userRepository.findAll();
		}
		public User getUserById(Integer id) {
			return userRepository.findById(id).orElse(null);
		}
		public User createUser(User user) {
			return userRepository.save(user);
		}
		public User updateUser(User user) {
			return userRepository.save(user);
		}
		public void delete(Integer id) {
			userRepository.deleteById(id);
		}
}
