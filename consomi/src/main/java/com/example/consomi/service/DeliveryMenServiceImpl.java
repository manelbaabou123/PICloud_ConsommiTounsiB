package com.example.consomi.service;

import com.example.consomi.entity.DeliveryMen;
import com.example.consomi.repository.DeliveryMenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryMenServiceImpl implements DeliveryMenService {

    @Autowired
    DeliveryMenRepository RepDeliveryMen;

    @Override
    public DeliveryMen AjouterDeliveryMen(DeliveryMen livreure) {
        RepDeliveryMen.save(livreure);
        return livreure;
    }

    @Override
    public void DeleteDeliveryMen(DeliveryMen livreure) {
        RepDeliveryMen.delete(livreure);
    }

    @Override
    public void DeleteDeliveryMen(Integer idDeliveryMen) {
        RepDeliveryMen.deleteById(idDeliveryMen);

    }

    @Override
    public List<DeliveryMen> getAllDeliveryMen() {
        return (List<DeliveryMen>) RepDeliveryMen.findAll();
    }

    @Override
    public String getDeliveryMenStatus(Integer idDeliveryMen) {
        DeliveryMen dm = (DeliveryMen) RepDeliveryMen.findById(idDeliveryMen).orElse(null);
        return dm.getEtat().toString();

    }

    @Override
    public String getDeliveryMenById(Integer idDeliveryMen) {
        DeliveryMen dm = (DeliveryMen) RepDeliveryMen.findById(idDeliveryMen).orElse(null);
        return dm.toString();
    }
}
