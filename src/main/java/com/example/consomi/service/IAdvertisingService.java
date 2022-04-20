package com.example.consomi.service;

import java.util.List;

import com.example.consomi.entity.Advertising;

public interface IAdvertisingService {
	
	Advertising addAdvertising(Advertising advertising);
	List<Advertising> getAllAdvertisings();
	Advertising getAdvertisingById(int idAd);
	Advertising getAdvertisingByChannel(String channel);
	Advertising updateAdvertising(Advertising advertising);
	void deleteAdvertisingById(int idAd);
	void deleteAllAdvertisings();
	public void affectAdvertisingToProduct(int idProduct, int idAd );

}
