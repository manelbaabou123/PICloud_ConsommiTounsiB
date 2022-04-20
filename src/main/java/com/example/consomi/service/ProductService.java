package com.example.consomi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.consomi.entity.Category;
import com.example.consomi.entity.Product;
import com.example.consomi.repository.CategoryRepository;
import com.example.consomi.repository.ProductRepository;
import com.example.consomi.service.IProductService;

@Service
public class ProductService implements IProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public ProductService() {
	}

	public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
	}
	
	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product getProductById(int idProd) {
		return productRepository.findById(idProd).get();
	}

	@Override
	public List<Product> getProductByName(String nameProd) {
		return productRepository.findByIName(nameProd);
	}

	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteProductById(int idProd) {
		productRepository.deleteById(idProd);
		
	}

	@Override
	public void deleteAllProducts() {
		productRepository.deleteAll();
		
	}

	@Override
	public void affectProductToCategory(int idProduct, int idCategory) {
		Product product = productRepository.findById(idProduct).get();
		Category category = categoryRepository.findById(idCategory).get();

		product.setCategory(category);
		productRepository.save(product);		
	}

	@Override
	public List<Product> getAllProductByNameCategory(String catName) {
		List<Product> prod = new ArrayList<>();
		for (Product p : productRepository.findAll()) {
			if(p.getCategory().getNameCategory() == catName)
			prod.add(p);
		}
		
		return prod;
	}


}
