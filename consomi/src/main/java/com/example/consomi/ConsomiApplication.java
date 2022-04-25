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
        Commande commande_1 = new Commande(1,29,NonPaye,new Date(System.currentTimeMillis()));
        Commande commande_2 = new Commande(2,55,NonPaye,new Date(System.currentTimeMillis()));
        Commande commande_3 = new Commande(3,49,NonPaye,new Date(System.currentTimeMillis()));

    }

}
