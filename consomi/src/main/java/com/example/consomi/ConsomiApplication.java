package com.example.consomi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class ConsomiApplication {
	@Autowired
    public static void main(String[] args) {
        SpringApplication.run(ConsomiApplication.class, args);
    }
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail()  {
	senderService.sendSimpleEmail("skander.chouchene@esprit.tn",
			"This is email body",
			"This is email subject");

	}

}
