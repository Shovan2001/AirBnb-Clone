package com.example.airBnb.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airBnb.Entities.Property;

public interface PropertyRepository extends JpaRepository<Property, Integer>{

}
