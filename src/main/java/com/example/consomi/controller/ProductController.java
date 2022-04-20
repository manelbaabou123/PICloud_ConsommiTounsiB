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

import com.example.consomi.entity.Product;
import com.example.consomi.service.ICategoryService;
import com.example.consomi.service.IProductService;

@RestController
@RequestMapping("/Products")
public class ProductController {
	
	@Autowired
	IProductService iProductService;

	@Autowired
	ICategoryService iCategoryService;
	
	public ProductController() {
	}
	
	public ProductController(IProductService iProductService, ICategoryService iCategoryService) {
		this.iProductService = iProductService;
		this.iCategoryService = iCategoryService;
	}
	
	@PostMapping("/addProduct")
	@ResponseBody
	public Product addProduct(@RequestBody Product product){	
		iProductService.addProduct(product);
		return product;
	}
	
	/*
	 * http://localhost:8081/SpringMVC/Product/getProductById/1
	 */
	@GetMapping(value = "getProductById/{idProduct}")
	@ResponseBody
	public Product getProductById(@PathVariable("idProduct") int idP) {
		return iProductService.getProductById(idP);
	}
	
	/*
	 * http://localhost:8081/SpringMVC/Product/getAllProducts
	 */
	@GetMapping(value = "/getAllProducts")
	@ResponseBody
	public List<Product> getAllProducts() {
		return iProductService.getAllProducts();
	}
	
	/*
	 * http://localhost:8081/SpringMVC/Product/updateProduct/1
	 */
	@PutMapping(value = "updateProduct")
	public void updateProduct(@RequestBody Product product) {
		iProductService.updateProduct(product);
	}
	
	/*
	 * http://localhost:8081/SpringMVC/Product/deleteProductById/1
	 */
	@DeleteMapping("/deleteProductById/{idProduct}")
	@ResponseBody
	public void deleteProductById(@PathVariable("idProduct") int idProd) {
		iProductService.deleteProductById(idProd);

	}
	
	/*
	 * http://localhost:8081/SpringMVC/Product/deleteAllProducts
	 */
	@DeleteMapping("/deleteAllProducts")
	@ResponseBody
	public void deleteAllProducts() {
		iProductService.deleteAllProducts();

	}
	
	@PutMapping("/assignProductToCategory")
	public void affectProductToCategory(@RequestParam("idProduct") int idProduct,@RequestParam("idCategory") int idCategory){
		iProductService.affectProductToCategory(idProduct, idCategory);
	}

}
