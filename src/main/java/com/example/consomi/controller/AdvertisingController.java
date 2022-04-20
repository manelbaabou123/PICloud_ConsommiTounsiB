package com.example.consomi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.consomi.entity.Advertising;
import com.example.consomi.service.IAdvertisingService;

@RestController
@RequestMapping("/Advertising")
public class AdvertisingController {
	
	@Autowired
	IAdvertisingService iAdvertisingService;
	
	public AdvertisingController() {
		
	}

	public AdvertisingController(IAdvertisingService iAdvertisingService) {
		this.iAdvertisingService = iAdvertisingService;
	}
	
	@PostMapping("/addAdvertising")
	@ResponseBody
	public Advertising addAdvertising(@RequestBody Advertising ad){	
		iAdvertisingService.addAdvertising(ad);
		return ad;
	}
	

	@GetMapping(value = "/getAdvertisingById/{idAdvertising}")
	@ResponseBody
	public Advertising getAdvertisingById(@PathVariable("idAdvertising") int idAd) {
		return iAdvertisingService.getAdvertisingById(idAd);
	}
	
	
	@GetMapping(value = "/getAllAdvertisings")
	@ResponseBody
	public List<Advertising> getAllAdvertisings() {
		return iAdvertisingService.getAllAdvertisings();
	}
	
	
	@PutMapping(value = "/updateAdvertising")
	public void updateAdvertising(@RequestBody Advertising advertising) {
		iAdvertisingService.updateAdvertising(advertising);
	}
	
	
	@DeleteMapping("/deleteAdvertisingById/{idAdvertising}")
	@ResponseBody
	public void deleteCategoryById(@PathVariable("idAdvertising") int idAd) {
		iAdvertisingService.deleteAdvertisingById(idAd);

	}
	
	
	@DeleteMapping("/deleteAllAdvertising")
	@ResponseBody
	public void deleteAllAdvertisings() {
		iAdvertisingService.deleteAllAdvertisings();

	}
	
	@GetMapping(value = "/getAdvertisingByChannel/{channelAd}")
	@ResponseBody
	public Advertising getAdvertisingByChannel(@PathVariable("channelAd") String channelAd){
		return iAdvertisingService.getAdvertisingByChannel(channelAd);
	}
	
	@PutMapping("/assignAdvertisingToProduct")
	public void affectAdvertisingToProduct(@RequestParam("idProduct") int idProduct, @RequestParam("idAd")int idAd ){
		iAdvertisingService.affectAdvertisingToProduct(idProduct, idAd);
	}

	

}
