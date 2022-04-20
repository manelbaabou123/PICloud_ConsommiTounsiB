package com.example.consomi.repository;

import com.example.consomi.entity.Facture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureRepository extends CrudRepository<Facture, Long> {
}
