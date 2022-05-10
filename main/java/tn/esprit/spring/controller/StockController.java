package tn.esprit.spring.controller;
import tn.esprit.spring.service.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.*;
@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/stock")
public class StockController {
	@Autowired
	StockService StockService;
	// http://localhost:8089/SpringMVC/stock/retrieve-all-Stocks
	@GetMapping("/retrieve-all-Stocks")
	@ResponseBody
	public List<Stock> getAllStocks() {
	List<Stock> listStock = StockService.getAllStocks();
	return listStock;
	}
	// http://localhost:8089/SpringMVC/stock/retrieve-all-Stockstrie
		@GetMapping("/retrieve-all-Stockstrie")
		@ResponseBody
	
	public List<Stock> findAllOrderByqt() {
		List<Stock> listStock = StockService.findAllOrderByqt();
	 return listStock;
		}
	// http://localhost:8089/SpringMVC/stock/add-stock
	
	@PostMapping("/add-stock")
	public void create(@RequestBody Stock Stock)
	{
	 StockService.create(Stock);
	
	
	}
	@DeleteMapping("/DeleteStock/{idStock}")
	@ResponseBody
	public void DeleteStock(@PathVariable("idStock") long id)
	{
		StockService.deleteStock(id);
	}
	
	// http://localhost:8089/SpringMVC/stock/update
	 @PutMapping("/update")
	 @ResponseBody
	 public void updateStock(@RequestBody Stock stock)
	 {
	  StockService.updateStock(stock);
	  }
	//http://localhost:8089/SpringMVC/stock/update
	 @GetMapping("/ajouterptos/{idstock}/{idp}")
	 @ResponseBody
	 public void AffectProductStock(@PathVariable("idp")long idProduit,@PathVariable("idstock") long idStock)
	 {
		 StockService.AffectProductStock(idProduit, idStock);
	                       
	 }
	 @PostMapping("/add-nstock")
		
		 public void AffectStockToNewProduct(@RequestBody produit_test produit)
			{ 
				
			 
			 
			 
			 StockService.AffectStockToNewProduct(produit);
			}
		
	 @PostMapping("/check/{idStock}")
		@ResponseBody
		public void getQuantiteRestante(@PathVariable("idStock") long id)
		{
			StockService.getQuantiteRestante(id);
		}
		}
