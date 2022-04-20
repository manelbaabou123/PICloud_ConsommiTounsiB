package com.example.consomi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.consomi.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	

	@Query("SELECT p FROM Product p WHERE p.nameProduct= :nameProduct")
	List<Product> findByIName(@Param("nameProduct") String nameProduct);

}
