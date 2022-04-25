package com.example.consomi.repository;

import com.example.consomi.entity.Reclamation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReclamationRepository extends CrudRepository<Reclamation, Integer> {

    @Query("select r from Reclamation r where r.etatReclamation='TRAITEE'")
    List<Reclamation> findAllTraitees();


    @Query("select r from Reclamation r where r.etatReclamation='NONTRAITEE'")
    List<Reclamation>findAllNonTraitees();

    @Query("select r from Reclamation r where r.etatReclamation='ENCOURS'")
    List<Reclamation>findAllEnCours();



    //@Query("select count(r) as count,r.livraison.livreur as livreur from Reclamation r group by r.livraison.livreur")
    //List<ReclamationLivreurStat> getReclamationsByLivreur();
}
