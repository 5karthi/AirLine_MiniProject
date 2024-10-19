package com.jetblue_project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetblue_project.controller.PassengerDto;
import com.jetblue_project.entity.Passenger;
import com.jetblue_project.repository.PassengerRepository;
@Service
public class PassengerServiceImpl implements PassengerService {

	
	@Autowired
	
	private PassengerRepository passRepo;
	
	
	@Override
	public void savePassenger(Passenger pass) {
		// TODO Auto-generated method stub
		
		passRepo.save(pass);
		
		

	}

	@Override
	public List<Passenger> listAllPass(Passenger pass) {
		// TODO Auto-generated method stub
		
		List<Passenger> passdata = passRepo.findAll();
		return passdata ;
	}


	public void deletePassbyID(long id) {
		// TODO Auto-generated method stub
		passRepo.deleteById(id);
		
	}

	@Override
	public Passenger updatepass(long id) {
		// TODO Auto-generated method stub
		Optional<Passenger> findById = passRepo.findById(id);
		Passenger pass1= findById.get();
		return pass1;
		
	}

	@Override
	public Passenger updatepassdata(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePassInfo(PassengerDto passDto) {
		// TODO Auto-generated method stub
		Passenger pass=new Passenger();
		pass.setId(passDto.getId());
		pass.setFname(passDto.getFname());
		pass.setLname(passDto.getLname());
		pass.setEmail(passDto.getEmail());
		pass.setContact(passDto.getContact());
		pass.setDepart(passDto.getDepart());
        pass.setDestination(passDto.getDestination());		
        
        passRepo.save(pass);
	}

}
