package com.example.consomi.repository;

import com.example.consomi.entity.Reclamation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamationRepository extends CrudRepository<Reclamation, Integer> {
}
