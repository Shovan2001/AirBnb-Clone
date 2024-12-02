package com.example.airBnb.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airBnb.Entities.Users;

public interface UsersRepository extends JpaRepository<Users,Integer>{

}
