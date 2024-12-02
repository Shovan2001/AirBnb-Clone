package com.example.airBnb.ServicesImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.airBnb.Entities.Booking;
import com.example.airBnb.Entities.Property;
import com.example.airBnb.Repositories.BookingRepository;
import com.example.airBnb.Repositories.PropertyRepository;
import com.example.airBnb.Services.BookingService;

@Service
public class BookingServiceImpl implements BookingService 
{
	@Autowired
	private BookingRepository bookingRepository;

	@Autowired
	private PropertyRepository propertyRepository;
	
	@Override
	public Booking createBooking(int property_id,LocalDate checkInDate,LocalDate checkOutDate ) 
	{
		// TODO Auto-generated method stub
		Property property=propertyRepository.findById(property_id).orElseThrow(()-> new RuntimeException("Property Not Found !!"));
		
		Booking booking=new Booking();
		
		booking.setCheckInDate(checkInDate);
		booking.setCheckOutDate(checkOutDate);
		booking.setProperty(property);
		
		return bookingRepository.save(booking);
	}

	@Override
	public Optional<Booking> updateBooking(Booking booking) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void deleteBooking(int id) {
		// TODO Auto-generated method stub
		bookingRepository.deleteById(id);
		return;
	}

	@Override
	public List<Booking> getAllBooking() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Booking> getBookingById(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	
	

}
