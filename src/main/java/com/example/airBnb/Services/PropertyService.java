package com.example.airBnb.Services;

import java.util.List;
import java.util.Optional;

import com.example.airBnb.Entities.Property;
import com.example.airBnb.Entities.Users;

public interface PropertyService {
	
	// create
	Property createProperty(Property property);

	// update
	Optional<Users> updateProperty(Property property);

	// delete
	void deleteProperty(int id);

	// getAll
	List<Property> getAllProperty();

	// getById
	Optional<Property> getPropertyById(int id);

}
