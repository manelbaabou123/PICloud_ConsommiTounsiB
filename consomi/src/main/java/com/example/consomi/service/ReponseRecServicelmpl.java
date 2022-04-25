package com.example.consomi.service;

import com.example.consomi.entity.Reclamation;
import com.example.consomi.entity.ReponseRec;
import com.example.consomi.repository.ReclamationRepository;
import com.example.consomi.repository.ReponseRecRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class ReponseRecServicelmpl {


    @Autowired
    ReponseRecRepository RepRecRep;

    @Autowired
    ReclamationRepository RepRecl;

    @Autowired
    ReclamationService ServRecl;


    public ReponseRec addReponse(ReponseRec reponse)
    {
        //Date today = new Date();
        //reponse.setDateReponse(today);
       return RepRecRep.save(reponse);

        //ServRecl.marquerTraitee(reponse.getReclamation().getId());

       // Reclamation rec = (Reclamation) RepRecl.findById(reponse.getReclamation().getId()).orElse(null);
        //rec.setReponseReclamation(reponse);

        //RepRecl.save(rec);


        //return reponse;
    }


    public long getTempsAttenteReclamation(int idReclamation)
    {
        Reclamation rec = (Reclamation) RepRecl.findById(idReclamation).orElse(null);

        long duree = Math.abs(rec.getReponseReclamation().getDateReponse().getTime()-rec.getDateReclamation().getTime());
        return duree;



    }

    public long getTempsAttenteMoyenReclamation() {

        long total=0;
        List<Reclamation> myList = RepRecl.findAllTraitees();
        for(Reclamation rec : myList)
        {
            total+= Math.abs(rec.getReponseReclamation().getDateReponse().getTime()-rec.getDateReclamation().getTime());
        }
        return total/myList.size();
    }

}
