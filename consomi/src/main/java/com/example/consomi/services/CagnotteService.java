package com.example.consomi.services;

import com.example.consomi.entity.Cagnotte;
import com.example.consomi.entity.User;
import com.example.consomi.repositories.CagnotteRepository;
import com.example.consomi.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class CagnotteService {

    @Autowired
    CagnotteRepository cr ;
    @Autowired
    UserRepository ur ;

    public Cagnotte addCagnote(){
        Cagnotte c=new Cagnotte();
        c.setDate(new Date());
        return cr.save(c);
    }


    public void deleteCagnotte(int idCagnote){

        cr.delete(cr.findById(idCagnote).get());
    }

    public List<Cagnotte> findall(){
        return cr.findAll();
    }


    public Cagnotte affecterAmountClient(int idCagnotte, int idUser , int amount){
        Cagnotte c = cr.findById(idCagnotte).get();
        c.setMontant(c.getMontant()+amount);
        User cc = ur.findById(idUser).get();
        c.getClients().add(cc);
        return cr.save(c);
    }

    public User getWinner(){
        List<User> clients=cr.getWinner();
        Collections.shuffle(clients);
        return clients.stream().findFirst().orElse(null);
    }


    public User getTopDonnater(){
        List<User> clients=cr.getWinner();
        return clients.stream().sorted((u,v)->Collections.frequency(clients, v)-Collections.frequency(clients, u)).findFirst().orElse((null));
    }

    public Cagnotte retrieveMoney(int idCagnotte , int amount){
        Cagnotte c = cr.findById(idCagnotte).get();
        if(c.getMontant()-amount>=0)
        { c.setMontant(c.getMontant()-amount);
            log.info("retrive reussi");
            return cr.save(c);
        }
        log.info("VOTRE SOLDE NEST PAS SUFFISANT");
        return cr.save(c);

    }

}
