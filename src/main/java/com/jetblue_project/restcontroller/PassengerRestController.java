package com.jetblue_project.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jetblue_project.entity.Passenger;
import com.jetblue_project.repository.PassengerRepository;


@RestController
@RequestMapping("/api")

public class PassengerRestController{
	@Autowired
	private PassengerRepository passRepo;
	//http://localhost:8080/api
	
	@GetMapping
	public List<Passenger>getAllPassengerApi(){
		List<Passenger> passdata = passRepo.findAll();
		return passdata;
	}
	//http://localhost:8080/api
	
	@PostMapping
    public void saveApi(@RequestBody Passenger pass) {
		
		passRepo.save(pass);
    	
    }
	
	//http://localhost:8080/api
	
		@PutMapping
	    public void updateApi(@RequestBody Passenger pass) {
			
			passRepo.save(pass);
	    	
	    }
		@DeleteMapping("/{id}")
		public void deletApi(@PathVariable("id")long id) {
			passRepo.deleteById(id);
			
		}
		

}
