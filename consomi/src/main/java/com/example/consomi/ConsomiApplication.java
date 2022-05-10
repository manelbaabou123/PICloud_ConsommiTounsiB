package com.example.consomi;

import com.example.consomi.entity.Commande;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

import static com.example.consomi.enumerated.OrderStatus.NonPaye;

@SpringBootApplication
public class ConsomiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsomiApplication.class, args);


    }

}
