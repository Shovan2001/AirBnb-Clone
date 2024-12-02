package com.example.airBnb.Services;

import java.util.List;
import java.util.Optional;

import com.example.airBnb.Entities.Users;

public interface UsersService 
{
	//create
	Users createUser(Users users);
	//update
	Optional<Users> updateUser(Users users);
	//delete
	void deleteUser(int id);
	//getAll
	List<Users> getAllUsers();
	//getById
	Optional<Users> getUserById(int id);
}
