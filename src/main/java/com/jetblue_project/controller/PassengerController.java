package com.jetblue_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jetblue_project.entity.Passenger;
import com.jetblue_project.services.PassengerService;
import com.jetblue_project.utils.Jetblue_projectService;
import com.sun.xml.bind.v2.model.core.LeafInfo;

@Controller
public class PassengerController {
	
	@Autowired
	private PassengerService passServ;
	@Autowired
	private Jetblue_projectService emailServ;

	@RequestMapping("/show")
	public String show() {
		
		
		return "show";
		
		
	}
	
	
	/*
	 * @RequestMapping("/savepass") public String savepass(@ModelAttribute Passenger
	 * pass) { passServ.savePassenger(pass);
	 * 
	 * 
	 * return "show";
	 * 
	 * }
	 */
	/*
	 * 
	 * 
	 * 
	 */
	  @RequestMapping("/savepass")
	  public String savepass(PassengerDto passDto){
	
	 
      Passenger pass=new Passenger(); 
      pass.setFname(passDto.getFname());
	  pass.setLname(passDto.getLname()); pass.setEmail(passDto.getEmail());
	  pass.setContact(passDto.getContact()); pass.setDepart(passDto.getDepart());
	  pass.setDestination(passDto.getDestination());
	  
	  passServ.savePassenger(pass); 
	  emailServ.jetblue_projectEmailSendService(pass.getEmail(), "welcome to JET BLUE AIRLINES","thank You for Booking");
	  return "show"; } 
	 
	
	
	
		
		
	

	
	/*
	 * @RequestMapping("/savepass") public String savepass(@RequestParam("fname")
	 * String fname,
	 * 
	 * @RequestParam("lname") String lname,
	 * 
	 * @RequestParam("email") String email,
	 * 
	 * @RequestParam("contact") String contact,
	 * 
	 * @RequestParam("depart") String depart,
	 * 
	 * @RequestParam("destination") String destination) {
	 * 
	 * Passenger pass =new Passenger(); pass.setFname(fname); pass.setLname(lname);
	 * pass.setEmail(email); pass.setContact(contact); pass.setDepart(depart);
	 * pass.setDestination(destination);
	 * 
	 * 
	 * 
	 * passServ.savePassenger(pass); return "show"; }
	 */
	
	//http://localhost:8080/listall
	@RequestMapping("/listall")
	public String listAllPassenger(Passenger pass,ModelMap model) {
		
	List<Passenger> passdata = passServ.listAllPass(pass);
	model.addAttribute("passdata", passdata);
		  
		return "listall";
	}
@RequestMapping("/deletepass")	
public String deletepass(@RequestParam("id")long id,ModelMap model,Passenger pass ) {
	passServ.deletePassbyID(id);
	List<Passenger> passdata = passServ.listAllPass(pass);
	model.addAttribute("passdata", passdata);
	  
	return "listall";

	
}
@RequestMapping	("/updatepass")
	public String updatepass(@RequestParam("id")long id,ModelMap model) {
	
	Passenger pass1 = passServ.updatepass(id);
	model.addAttribute("pass1", pass1);
	return "update_pass";
	
	
	
	
}			
@RequestMapping("/updatepassdata")
public String updatepassdata(PassengerDto passDto,Passenger pass, ModelMap model) {
passServ.updatePassInfo(passDto);			
List<Passenger> passdata = passServ.listAllPass(pass);
model.addAttribute("passdata", passdata);
				  
return "listall";
			}

	
}
	
	
	
	
	
	
	
	
	
	
	
	
		

