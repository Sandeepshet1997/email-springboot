package com.example.demo;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class EmailYmlSpringbootApplication  implements CommandLineRunner  {
	@Autowired
	private JavaMailSender javaMailSender;
	public static void main(String[] args) {
		SpringApplication.run(EmailYmlSpringbootApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws MessagingException {
		sendmail();	
}
	private void sendmail()
	{
		
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("sandeepsheta20@gmail.com");
		msg.setSubject("spring boot yml demo");
		msg.setText("Welcome to India");
		
		System.out.println("Sending.............");
		javaMailSender.send(msg);
		System.out.println("Sent"); 
	}
	
	
	
}
