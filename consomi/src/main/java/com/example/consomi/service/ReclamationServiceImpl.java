package com.example.consomi.service;

import com.example.consomi.entity.Reclamation;
import com.example.consomi.enumerated.ReclamationStatus;
import com.example.consomi.repository.ReclamationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class ReclamationServiceImpl implements ReclamationService{


    @Autowired
    ReclamationRepository RepRecl;

    //@Autowired
    //UserRepository ur;

    //@Autowired
    //CommandeRepository cr;

    @Override

    public Reclamation addReclamation(Reclamation reclamation)
    {
        Date d =new Date();
        reclamation.setDateReclamation(d);
        reclamation.setEtatReclamation(ReclamationStatus.NonTraitée);

        return RepRecl.save(reclamation);

    }



    @Override
    public void DeleteReclamation(Integer idRec) {
        RepRecl.deleteById(idRec);
    }

    @Override
    public List<Reclamation> getAllReclamation() {
        return (List<Reclamation>) RepRecl.findAll();
    }


    @Override
    public List<Reclamation> getAllReclamations()
    {
        List<Reclamation> myList = (List<Reclamation>) RepRecl.findAll();
        for(Reclamation rec : myList)
        {
            rec.getLivraison().setCommande(null);
        }
        return myList;
    }


    public List<Reclamation> getReclamationsTraitees()
    {
        List<Reclamation> myList = RepRecl.findAllTraitees();
        for(Reclamation rec : myList)
        {
            rec.getLivraison().setCommande(null);
        }
        return myList;

    }

    public List<Reclamation> getReclamationsNonTraitees()
    {
        List<Reclamation> myList = RepRecl.findAllNonTraitees();
        for(Reclamation rec : myList)
        {
            rec.getLivraison().setCommande(null);
        }
        return myList;
    }

    public List<Reclamation> getReclamationsEnCours()
    {
        List<Reclamation> myList = RepRecl.findAllEnCours();
        for(Reclamation rec : myList)
        {
            rec.getLivraison().setCommande(null);
        }
        return myList;
    }

   /* public List<Reclamation> getReclamationsByClient(int idClient)
    {
        List<Reclamation> first = (List<Reclamation>) RepRecl.findAll();
        List<Reclamation> second = new ArrayList<Reclamation>();
        for(Reclamation rec : first)
        {
            if(rec.getLivraison().getCommande().getCarts().get(0).getClient().getId()==idClient)
            {
                rec.getLivraison().setCommande(null);
                second.add(rec);

            }
        }

        return second;
    }*/


   /* public List<ReclamationLivreurStat> getReclamationsByLivreur()
    {
        return RepRecl.getReclamationsByLivreur();
    }*/


    public void marquerEnCours(int idReclamation)
    {
        Reclamation rec = (Reclamation) RepRecl.findById(idReclamation).orElse(null);
        rec.setEtatReclamation(ReclamationStatus.EnCours);
        RepRecl.save(rec);
    }

    public void marquerTraitee(int idReclamation)
    {
        Reclamation rec = (Reclamation) RepRecl.findById(idReclamation).orElse(null);
        rec.setEtatReclamation(ReclamationStatus.Traitée);
        RepRecl.save(rec);
    }

    public void marquerNonTraitee(int idReclamation)
    {
        Reclamation rec = (Reclamation) RepRecl.findById(idReclamation).orElse(null);
        rec.setEtatReclamation(ReclamationStatus.NonTraitée);
        RepRecl.save(rec);
    }

}
