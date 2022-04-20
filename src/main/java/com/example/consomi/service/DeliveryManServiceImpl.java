package com.example.consomi.service;

import com.example.consomi.entity.Delivery;
import com.example.consomi.entity.DeliveryMan;
import com.example.consomi.repository.DeliveryManRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryManServiceImpl implements DeliveryManService {

    @Autowired
    DeliveryManRepository RepDeliveryMan;

    @Override
    public DeliveryMan AjouterDeliveryMan(DeliveryMan livreure) {
        RepDeliveryMan.save(livreure);
        return livreure;
    }

    @Override
    public void DeleteDeliveryMan(DeliveryMan livreure) {
        RepDeliveryMan.delete(livreure);
    }

    @Override
    public void DeleteDeliveryMan(Integer idDeliveryMan) {
        RepDeliveryMan.deleteById(idDeliveryMan);

    }

    @Override
    public List<DeliveryMan> getAllDeliveryMan() {
        return (List<DeliveryMan>) RepDeliveryMan.findAll();
    }

    @Override
    public String getDeliveryManStatus(Integer idDeliveryMan ) {
        DeliveryMan dm = (DeliveryMan)RepDeliveryMan.findById(idDeliveryMan).orElse(null);
        return dm.getEtat().toString();

    }

    @Override
    public String getDeliveryManById(Integer idDeliveryMan) {
        DeliveryMan dm = (DeliveryMan)RepDeliveryMan.findById(idDeliveryMan).orElse(null);
        return dm.toString();
    }
}
