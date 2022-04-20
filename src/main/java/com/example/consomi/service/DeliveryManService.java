package com.example.consomi.service;

import com.example.consomi.entity.DeliveryMan;

import java.util.List;

public interface DeliveryManService {
    DeliveryMan AjouterDeliveryMan(DeliveryMan livreure);
    void DeleteDeliveryMan(DeliveryMan livreure);
    void DeleteDeliveryMan(Integer idDeliveryMan);
    List<DeliveryMan> getAllDeliveryMan();
    public String getDeliveryManById(Integer idDeliveryMan);
    public String getDeliveryManStatus(Integer idDeliveryMan );
}
