package com.jetblue_project.services;

import java.util.List;

import com.jetblue_project.controller.PassengerDto;
import com.jetblue_project.entity.Passenger;

public interface PassengerService {
	
	public void savePassenger(Passenger pass);
	
	public List<Passenger> listAllPass(Passenger pass);

	public void deletePassbyID(long id);

	public Passenger updatepass(long id);
	public Passenger updatepassdata(long id);

	public void updatePassInfo(PassengerDto passDto);


}
