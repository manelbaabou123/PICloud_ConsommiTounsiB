package com.example.consomi.service;

import com.example.consomi.entity.DeliveryMen;

import java.util.List;

public interface DeliveryMenService {
    DeliveryMen AjouterDeliveryMen(DeliveryMen livreure);
    void DeleteDeliveryMen(DeliveryMen livreure);
    void DeleteDeliveryMen(Integer idDeliveryMen);
    List<DeliveryMen> getAllDeliveryMen();
    public String getDeliveryMenById(Integer idDeliveryMen);
    public String getDeliveryMenStatus(Integer idDeliveryMen);
}
