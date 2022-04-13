package tn.esprit.pi_dev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.pi_dev.entities.Cagnotte;
import tn.esprit.pi_dev.entities.Client;
import tn.esprit.pi_dev.repositories.CagnotteRepository;
import tn.esprit.pi_dev.repositories.ClientRepository;

import java.util.Date;
import java.util.List;

@Service
public class CagnotteService {

    @Autowired
    CagnotteRepository cr;
    @Autowired
    ClientRepository ccr;

    public Cagnotte addCagnote(Cagnotte c){
        c.setDate(new Date());
       return cr.save(c);
    }

    public Cagnotte affecterAmountClient(int idCagnotte, int idClient , int amount){
        Cagnotte c = cr.findById(idCagnotte).get();
        c.setMongton(c.getMongton()+amount);
        Client cc = ccr.findById(idClient).get();
        c.getClients().add(cc);
        return cr.save(c);
    }

    public void deleteCagnotte(int idCagnote){
        cr.delete(cr.findById(idCagnote).get());
    }

    public List<Cagnotte> findall (){
        return cr.findAll();
    }



}
