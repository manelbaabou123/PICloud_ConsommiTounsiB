package com.example.consomi.service;

import com.example.consomi.entity.Delivery;

import java.util.List;

public interface DeliveryService {

    Delivery AjouterDelivery(Delivery livraison);
    void DeleteDelivery(Delivery livraison);
    void DeleteDelivery(Long idDelivery);
    List<Delivery> getAllDelivery();
    public String getDeliveryById(Long idDelivery);
    //Delivery getDeliveryById(Long idDelivery);
    public String getDeliveryStatus(Long idDelivery );
    public List<Delivery> getCurrentDeliveries();
    public List<Delivery> getHistoryDeliveries();

    List<Delivery> getCurrentDeliveriesForDeliveryMan(Integer idDeliveryMan);
}
