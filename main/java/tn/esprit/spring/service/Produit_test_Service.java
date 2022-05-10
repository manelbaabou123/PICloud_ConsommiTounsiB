package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.entity.produit_test;
import tn.esprit.spring.repository.produit_testRepository;

@Service
public class Produit_test_Service {
	@Autowired
	produit_testRepository produit_testRepository;
	public void create(produit_test produit_test){
		produit_testRepository.save(produit_test);
	}
	

	public List<produit_test> getAllStocks(){
		List<produit_test> list = new ArrayList<>();
		
		this.produit_testRepository.findAll().forEach(i->list.add(i));
		return list;
     }
}