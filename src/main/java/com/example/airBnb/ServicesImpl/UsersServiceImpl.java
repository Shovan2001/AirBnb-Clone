package com.example.airBnb.ServicesImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.airBnb.Entities.Users;
import com.example.airBnb.Repositories.UsersRepository;
import com.example.airBnb.Services.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersRepository usersRepository;

	// Create
	@Override
	public Users createUser(Users users) {

		return usersRepository.save(users);
	}

	// Update
	@Override
	public Optional<Users> updateUser(Users users) {
		return Optional.empty();
	}

	// Delete
	@Override
	public void delete(int id) {
		usersRepository.deleteById(id);
		return;
	}

	// GetById
	@Override
	public Optional<Users> getUserById(int id) {
		// TODO Auto-generated method stub
		return usersRepository.findById(id);
	}

	// GetAllUsers
	@Override
	public List<Users> getAllUsers() {
		return usersRepository.findAll();
	}

}
