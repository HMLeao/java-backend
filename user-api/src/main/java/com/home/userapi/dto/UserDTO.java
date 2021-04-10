package com.home.userapi.dto;

import java.util.Date;

import com.home.userapi.entity.User;

public class UserDTO {
	
	private String name;
	private String cpf;
	private String address;
	private String email;
	private String telephone;
	private Date createdAt;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	
	public static UserDTO convert(User user) {
		
		UserDTO userDTO = new UserDTO();
		
		userDTO.setName(user.getName());
		userDTO.setCpf(user.getCpf());
		userDTO.setAddress(user.getAddress());
		userDTO.setEmail(user.getEmail());
		userDTO.setTelephone(user.getTelephone());
		userDTO.setCreatedAt(user.getCreatedAt());
		
		return userDTO;
	}
}

