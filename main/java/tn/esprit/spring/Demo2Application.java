package tn.esprit.spring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.hibernate.mapping.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tn.esprit.spring.entity.RayonTyp;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.entity.produit_test;
import tn.esprit.spring.entity.ray;

import tn.esprit.spring.service.StockService;
import tn.esprit.spring.service.rayService;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner   {

	@Autowired
	StockService stockService;
	@Autowired
	rayService rs;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
	 @Override
	public void run(String... args) throws Exception {
	 //stockService.create(new Stock(new Long(0), new Long(13),new Long(5)));
	//	stockService.getQuantiteRestante(new Long (4));
	//	rs.create(new ray(new Long(1), new String("chips"), RayonTyp.normal));
	}
	

}
