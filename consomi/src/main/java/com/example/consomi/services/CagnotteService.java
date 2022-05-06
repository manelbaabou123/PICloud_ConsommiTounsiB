package com.example.consomi.services;

import com.example.consomi.entity.Cagnotte;
import com.example.consomi.entity.User;
import com.example.consomi.repositories.CagnotteRepository;
import com.example.consomi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.Date;
import java.util.List;

@Service

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
        cc.getCagnotte().add(c);
        return cr.save(c);
    }


}
