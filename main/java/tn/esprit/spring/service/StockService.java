package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import tn.esprit.spring.repository.*;

import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.entity.produit_test;

@Service
public class StockService {
	@Autowired
	StockRepository StockRepository;
	@Autowired
	produit_testRepository pr;
	@Autowired
	EmailServiceImpl es;
	public void create(Stock stock){
		StockRepository.save(stock);
	}
	
	
	public List<Stock> getAllStocks(){
		List<Stock> list = new ArrayList<>();
		
		this.StockRepository.findAll().forEach(i->list.add(i));
		return list;
			
	}
	public void deleteStock(Long id) {
	     StockRepository.deleteById(id);
	}

	public Stock updateStock(Stock s) {
		return StockRepository.save(s);
	}
	
	
	public void getQuantiteRestante(long id)
	{
		Stock stock = (Stock) StockRepository.findById(id).orElse(null);
		
		long q =stock.getQuantity();
		
		if(q==0)
		{
			String text = "la quantite de stock est "+q;
			//ENVOIE MAIL NO MORE STOCK
			es.sendSimpleMessage( text);
			
		}
		else
		{ 

		String text = "la quantite de stock est "+q;
		//ENVOIE MAIL NO MORE STOCK
		es.sendSimpleMessage( text);
		
			
		}
		
		
		
		
	}
	public List<Stock> findAllOrderByqt()
	
	{
		
		List<Stock> list = new ArrayList<>();
		
		list=this.StockRepository.findAllOrderByquantity();
		
		return list;
		
	}
	


	public void AffectProductStock(long idProduit, long idStock)
	{
		produit_test produit = (produit_test) pr.findById(idProduit).orElse(null);
		if(produit.getStocks()==null)
		{
			Stock oldStock = (Stock) StockRepository.findById(idStock).orElse(null);
			if(oldStock != null)
			{	oldStock.setQuantity(oldStock.getQuantity()+1);
				
				produit.setStocks(oldStock);
				StockRepository.save(oldStock);
				pr.save(produit);
			}
		}
		}
	public void AffectStockToNewProduct(produit_test produit)
	{ long a;
	a=1;
		Stock newStock = new Stock();
		
		newStock.setQuantity(a);
		produit.setStocks(newStock);
		
		
		StockRepository.save(newStock);
		
		pr.save(produit);
	}
		
		
	
	
	
}