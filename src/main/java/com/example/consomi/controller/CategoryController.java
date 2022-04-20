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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.consomi.entity.Category;
import com.example.consomi.service.ICategoryService;

@RestController
@RequestMapping("/Categories")
public class CategoryController {

	@Autowired
	ICategoryService iCategoryService;


	public CategoryController() {
	}
	
	public CategoryController(ICategoryService iCategoryService) {
		this.iCategoryService = iCategoryService;
	}
	
	@PostMapping("/addCategory")
	@ResponseBody
	public Category addCategory(@RequestBody Category category){	
		iCategoryService.addCategory(category);
		return category;
	}
	

	@GetMapping(value = "/getCategoryById/{idCategory}")
	@ResponseBody
	public Category getCategoryById(@PathVariable("idCategory") int idCat) {
		return iCategoryService.getCategoryById(idCat);
	}
	
	
	@GetMapping(value = "/getAllCategories")
	@ResponseBody
	public List<Category> getAllCategories() {
		return iCategoryService.getAllCategories();
	}
	
	
	@PutMapping(value = "/updateCategory")
	public void updateCategory(@RequestBody Category category) {
		iCategoryService.updateCategory(category);
	}
	
	
	@DeleteMapping("/deleteCategoryById/{idCategory}")
	@ResponseBody
	public void deleteCategoryById(@PathVariable("idCategory") int idCat) {
		iCategoryService.deleteCategoryById(idCat);

	}
	
	
	@DeleteMapping("/deleteAllCategories")
	@ResponseBody
	public void deleteAllCategories() {
		iCategoryService.deleteAllCategories();

	}
	
	@GetMapping(value = "/getNbrCategories")
	public int getNbrCategories(){
		return iCategoryService.getNbrCategories();
	}
	
	@GetMapping(value = "/getCategoryByName/{nameCategory}")
	@ResponseBody
	public Category getCategoryByName(@PathVariable("nameCategory") String nameCategory){
		return iCategoryService.getCategoryByName(nameCategory);
	}
	

}
