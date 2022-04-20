package com.example.consomi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.consomi.entity.Category;
import com.example.consomi.repository.CategoryRepository;
import com.example.consomi.service.ICategoryService;

@Service
public class CategoryService implements ICategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	public CategoryService() {
	}

	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	@Override
	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> getAllCategories() {
		return (List<Category>) categoryRepository.findAll();
	}

	@Override
	public Category getCategoryById(int idCat) {
		return categoryRepository.findById(idCat).get();
	}

	@Override
	public Category getCategoryByName(String nameCat) {
		return categoryRepository.findCategoryByName(nameCat);
	}

	@Override
	public Category updateCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public void deleteCategoryById(int idCat) {
		categoryRepository.deleteById(idCat);
		
	}

	@Override
	public void deleteAllCategories() {
		categoryRepository.deleteAll();	
		
	}

	@Override
	public int getNbrCategories() {
		return categoryRepository.nbrCategories();
	}


}
