package com.example.consomi.service;

import com.example.consomi.entity.Delivery;
import com.example.consomi.enumerated.DeliveryStatus;
import com.example.consomi.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryServiceImpl implements DeliveryService{
    @Autowired
    DeliveryRepository RepDelivery;

    @Override
    public Delivery AjouterDelivery(Delivery livraison) {
        RepDelivery.save(livraison);
        return livraison;
    }

    @Override
    public void DeleteDelivery(Delivery livraison) {
        RepDelivery.delete(livraison);
    }

    @Override
    public void DeleteDelivery(Long idDelivery) {
        RepDelivery.deleteById(idDelivery);

    }

    @Override
    public List<Delivery> getAllDelivery() {
        return (List<Delivery>) RepDelivery.findAll();
    }

    @Override
    public String getDeliveryStatus(Long idDelivery ) {
        Delivery d = (Delivery)RepDelivery.findById(idDelivery).orElse(null);
        return d.getEtat().toString();

    }

    @Override
    public String getDeliveryById(Long idDelivery) {
        Delivery d = (Delivery)RepDelivery.findById(idDelivery).orElse(null);
        return d.toString();
    }

    @Override
    public List<Delivery> getCurrentDeliveries()
    {
        return RepDelivery.getCurrentDeliveries(DeliveryStatus.done);
    }

    @Override
    public List<Delivery> getHistoryDeliveries()
    {
        return RepDelivery.getHistoryDeliveries(DeliveryStatus.done);
    }



    public List<Delivery> getCurrentDeliveriesForDeliveryMen(Integer idDeliveryMen)
    {
        return RepDelivery.getCurrentDeliveriesForDeliveryMen(DeliveryStatus.done, idDeliveryMen);
    }
}
