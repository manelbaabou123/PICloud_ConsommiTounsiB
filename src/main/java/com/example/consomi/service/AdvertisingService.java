package com.example.consomi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.consomi.entity.Advertising;
import com.example.consomi.entity.Product;
import com.example.consomi.repository.AdvertisingRepository;
import com.example.consomi.repository.ProductRepository;
import com.example.consomi.service.IAdvertisingService;

@Service
public class AdvertisingService implements IAdvertisingService {
	
	@Autowired
	AdvertisingRepository advertisingRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	public AdvertisingService() {
	}

	public AdvertisingService(AdvertisingRepository advertisingRepository) {
		this.advertisingRepository = advertisingRepository;
	}
	
	@Override
	public Advertising addAdvertising(Advertising advertising) {
		return advertisingRepository.save(advertising);
	}

	@Override
	public List<Advertising> getAllAdvertisings() {
		return (List<Advertising>) advertisingRepository.findAll();
	}

	@Override
	public Advertising getAdvertisingById(int idAd) {
		return advertisingRepository.findById(idAd).get();
	}

	@Override
	public Advertising getAdvertisingByChannel(String channel) {
		return advertisingRepository.findAdvertisingByChannel(channel);
	}

	@Override
	public Advertising updateAdvertising(Advertising advertising) {
		return advertisingRepository.save(advertising);
	}

	@Override
	public void deleteAdvertisingById(int idAd) {
		advertisingRepository.deleteById(idAd);
		
	}

	@Override
	public void deleteAllAdvertisings() {
		advertisingRepository.deleteAll();
		
	}

	@Override
	public void affectAdvertisingToProduct(int idProduct, int idAd) {
		Product product = productRepository.findById(idProduct).get();
		Advertising ad = advertisingRepository.findById(idAd).get();
		
		ad.setProduct(product);
		advertisingRepository.save(ad);
		
	}

}
