package com.example.airBnb.Services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.example.airBnb.Entities.Booking;

public interface BookingService {
	// create
	Booking createBooking(int property_id,LocalDate checkInDate,LocalDate checkOutDate);

	// update
	Optional<Booking> updateBooking(Booking booking);

	// delete
	void deleteBooking(int id);

	// getAll
	List<Booking> getAllBooking();

	// getById
	Optional<Booking> getBookingById(int id);

}
