package com.example.airBnb.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.airBnb.Entities.Booking;
import com.example.airBnb.Repositories.BookingRepository;
import com.example.airBnb.Services.BookingService;

@Service
public class BookingServiceImpl implements BookingService 
{
	@Autowired
	private BookingRepository bookingRepository;
	
	

}
