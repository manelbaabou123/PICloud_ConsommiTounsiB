package tn.esprit.pi_dev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.pi_dev.entities.Donation;
import tn.esprit.pi_dev.entities.Product;
import tn.esprit.pi_dev.repositories.DonationRepository;

import java.util.List;

@Service
public class DonationService {

    @Autowired
    DonationRepository dr;

    public Donation addDonation(Donation d ){
      return   dr.save(d);
    }

    public Donation affecterProducts(int id , List<Product> products ){
        dr.findById(id).get().getProductsDonated().addAll(products);
        return dr.save(dr.findById(id).get());
    }

    public void deleteDonation(int id){
        dr.delete(dr.findById(id).get());
    }

    public List<Donation> findAll(){
        return dr.findAll();
    }

    public List<Product> findProductsByDonation(int id){
       return dr.findById(id).get().getProductsDonated();
    }


}
