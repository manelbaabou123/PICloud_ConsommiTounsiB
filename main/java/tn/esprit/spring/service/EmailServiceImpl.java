package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import org.springframework.stereotype.Service;
@Service
public class EmailServiceImpl  {
	
    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(
       String text) {
        
        SimpleMailMessage message = new SimpleMailMessage(); 
        message.setFrom("yassine.bensalem@esprit.tn");
        message.setTo("yassine.bensalem@esprit.tn"); 
        message.setSubject("qt de stock"); 
        message.setText(text);
        emailSender.send(message);
        
    }
}
