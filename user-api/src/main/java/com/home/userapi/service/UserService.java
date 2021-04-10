package com.home.userapi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.userapi.dto.UserDTO;
import com.home.userapi.entity.User;
import com.home.userapi.repository.UserRepository;
// here goes all the business logic!
@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<UserDTO> getAll() {
		List<User> users = repository.findAll();
		return users.stream().map(UserDTO::convert).collect(Collectors.toList());
	}
	
	public Optional<UserDTO> getUserByCpf(String cpf) {
		return Optional.ofNullable(UserDTO.convert(repository.findByCPF(cpf)));
	}
	
	public UserDTO create(UserDTO userDto) {
		User user = User.convert(userDto);
		return UserDTO.convert(repository.save(user));
	}
	
	public Integer delete(String cpf) {
		return repository.deleteByCPF(cpf);
	}
	
}
