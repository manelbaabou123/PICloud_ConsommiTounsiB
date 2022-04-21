package com.example.consomi.repository;

import com.example.consomi.entity.DeliveryMen;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryMenRepository extends CrudRepository<DeliveryMen, Integer> {
}
