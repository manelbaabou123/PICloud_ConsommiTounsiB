package com.example.consomi.service;

import java.util.List;

import com.example.consomi.entity.Category;

public interface ICategoryService {

	Category addCategory(Category category);
	List<Category> getAllCategories();
	Category getCategoryById(int idCat);
	Category getCategoryByName(String nameCat);
	Category updateCategory(Category category);
	void deleteCategoryById(int idCat);
	void deleteAllCategories();
	int getNbrCategories();
}
