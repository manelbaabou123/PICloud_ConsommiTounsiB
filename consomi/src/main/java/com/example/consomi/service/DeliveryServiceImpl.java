package com.example.consomi.service;

import com.example.consomi.entity.Commande;
import com.example.consomi.entity.Delivery;
import com.example.consomi.enumerated.DeliveryStatus;
import com.example.consomi.exception.DeliveryNotFoundException;
import com.example.consomi.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryServiceImpl implements DeliveryService{

    @Autowired
    DeliveryRepository RepDelivery;
    //CommandeRepository RepCommande;

    //Ajouter une livraison
    @Override
    public Delivery AddDelivery(Delivery delivery) {
        //Commande c = (Commande)RepCommande.findById(RepCommande.getCommande().getId()).orElse(null);
        //delivery.setCommande(c);
        //delivery.setEtat(DeliveryStatus.enAttente);
        RepDelivery.save(delivery);
        return delivery;
    }

    //Modifier une livraison
    @Override
    public Delivery UpdateDelivery(Delivery delivery) {
        RepDelivery.save(delivery);
        return delivery;
    }


    //Supprimer une livraison
    @Override
    public void DeleteDelivery(Long idDelivery) {
        RepDelivery.deleteById(idDelivery);

    }

    //Consulter toutes les livraisons
    @Override
    public List<Delivery> getAllDelivery() {
        return (List<Delivery>) RepDelivery.findAll();
    }

    @Override
    public String getDeliveryStatus(Long idDelivery ) {
        Delivery d = (Delivery)RepDelivery.findById(idDelivery).
                orElseThrow(() -> new DeliveryNotFoundException("Delivery by id: "+ idDelivery +" was not found !"));
        return d.getEtat().toString();

    }

    //Consulter une livraison
    @Override
    public String getDeliveryById(Long idDelivery) {
        Delivery d = (Delivery)RepDelivery.findById(idDelivery).
                orElseThrow(() -> new DeliveryNotFoundException("Delivery by id: "+ idDelivery +" was not found !"));
        return d.toString();
    }

    //Consulter les livraisons en cours et en attente
    @Override
    public List<Delivery> getCurrentDeliveries()
    {
        return RepDelivery.getCurrentDeliveries(DeliveryStatus.done);
    }

    //Consulter les livraisons terminées
    @Override
    public List<Delivery> getHistoryDeliveries()
    {
        return RepDelivery.getHistoryDeliveries(DeliveryStatus.done);
    }


    //Consulter les livraisons en cours et en attente pour chaque livreur
    @Override
    public List<Delivery> getCurrentDeliveriesForDeliveryMen(Integer idDeliveryMen)
    {
        return RepDelivery.getCurrentDeliveriesForDeliveryMen(DeliveryStatus.done, idDeliveryMen);
    }




    @Override
    public long getTempsAttenteDelivery(Long idDelivery)
    {
        Delivery d = (Delivery)RepDelivery.findById(idDelivery).
                orElseThrow(() -> new DeliveryNotFoundException("Delivery by id: "+ idDelivery +" was not found !"));
        long duree = Math.abs(d.getDeliveryDate().getTime()-d.getCommande().getDateOrder().getTime());

        return duree;
    }

    @Override
    public long getTempsAttenteMoyen()
    {
        long dureeTotale=0;
        for(Delivery d: getHistoryDeliveries() )
        {
            dureeTotale += Math.abs(d.getDeliveryDate().getTime()-d.getCommande().getDateOrder().getTime());
        }
        long moyenne = dureeTotale/getHistoryDeliveries().size();

        return moyenne;
    }


}
