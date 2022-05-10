package com.example.consomi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.Facturee;

@Repository
public interface FactureeRepository extends JpaRepository<Facturee, Long> {

}
