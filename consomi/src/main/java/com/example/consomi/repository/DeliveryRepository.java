package com.example.consomi.repository;

import com.example.consomi.entity.Delivery;
import com.example.consomi.enumerated.DeliveryStatus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryRepository extends CrudRepository<Delivery, Long> {
    @Query("select d from Delivery d where d.etat != :done and d.livreur.id = :idLivreur ")
    List<Delivery> getCurrentDeliveriesForDeliveryMen(@Param("done") DeliveryStatus etat, @Param("idLivreur") int id);


    @Query("select d from Delivery d where d.etat != :done")
    List<Delivery> getCurrentDeliveries(@Param("done") DeliveryStatus etat);


    @Query("select d from Delivery d where d.etat = :done")
    List<Delivery> getHistoryDeliveries(@Param("done") DeliveryStatus etat);


}
