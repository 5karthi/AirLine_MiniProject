package com.jetblue_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jetblue_project.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
