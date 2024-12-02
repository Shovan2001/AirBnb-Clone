package com.example.airBnb.ServicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.airBnb.Entities.Property;
import com.example.airBnb.Entities.Users;
import com.example.airBnb.Repositories.PropertyRepository;
import com.example.airBnb.Services.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	private PropertyRepository propertyRepository;

	@Override
	public Property createProperty(Property property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Users> updateProperty(Property property) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void deleteProperty(int id) {
		// TODO Auto-generated method stub
		propertyRepository.deleteById(id);
		
	}

	@Override
	public List<Property> getAllProperty() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Property> getPropertyById(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
}
