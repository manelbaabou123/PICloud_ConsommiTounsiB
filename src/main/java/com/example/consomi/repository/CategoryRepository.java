package com.example.consomi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.consomi.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
	@Query("SELECT c FROM Category c WHERE c.nameCategory= :nameCategory")
	Category findCategoryByName(@Param("nameCategory") String nameCategory);
	
	@Query("SELECT count(c) FROM Category c ")
	int nbrCategories();

}
