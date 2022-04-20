package com.example.consomi.service;

import java.util.List;

import com.example.consomi.entity.Product;

public interface IProductService {

	Product addProduct(Product product);
	List<Product> getAllProducts();
	Product getProductById(int idProd);
	List<Product> getProductByName(String nameProd);
	Product updateProduct(Product product);
	void deleteProductById(int idProd);
	void deleteAllProducts();
	public void affectProductToCategory(int idProduct, int idCategory );
	List<Product> getAllProductByNameCategory(String catName );
}
