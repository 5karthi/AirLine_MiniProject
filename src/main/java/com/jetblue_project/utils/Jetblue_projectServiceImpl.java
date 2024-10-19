package com.jetblue_project.utils;

import org.apache.logging.log4j.message.SimpleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class Jetblue_projectServiceImpl implements Jetblue_projectService {
	
  @Autowired
  private JavaMailSender sender;
	@Override
	public void jetblue_projectEmailSendService(String to, String sub, String text) {
		// TODO Auto-generated method stub

		
		SimpleMailMessage msg= new SimpleMailMessage();
		msg.setTo(to);
		msg.setSubject(sub);
		msg.setText(text);
		sender.send(msg);
	
	}

}
