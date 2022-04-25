package com.example.consomi.service;

import com.example.consomi.entity.Delivery;

import java.util.List;

public interface DeliveryService {

    Delivery AddDelivery(Delivery delivery);
    void DeleteDelivery(Long idDelivery);
    Delivery UpdateDelivery(Delivery delivery);
    List<Delivery> getAllDelivery();
    public String getDeliveryById(Long idDelivery);
    public String getDeliveryStatus(Long idDelivery );
    public List<Delivery> getCurrentDeliveries();
    public List<Delivery> getHistoryDeliveries();

    List<Delivery> getCurrentDeliveriesForDeliveryMen(Integer idDeliveryMen);



    public long getTempsAttenteDelivery(Long idDelivery);
    public long getTempsAttenteMoyen();


}
