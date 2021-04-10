package com.home.userapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.userapi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByCPF(String cpf);
	
	List<User> queryByNameLike(String name);
	
	Integer deleteByCPF(String cpf);
	
}
