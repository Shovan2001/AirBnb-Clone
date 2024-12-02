package com.example.airBnb.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airBnb.Entities.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
