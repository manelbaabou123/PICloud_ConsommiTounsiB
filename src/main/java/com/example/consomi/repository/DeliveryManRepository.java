package com.example.consomi.repository;

import com.example.consomi.entity.DeliveryMan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryManRepository extends CrudRepository<DeliveryMan, Integer> {
}
