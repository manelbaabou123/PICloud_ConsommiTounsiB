package com.example.consomi.service;

import com.example.consomi.entity.Reclamation;
import com.example.consomi.repository.ReclamationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReclamationServiceImpl implements ReclamationService{
    @Autowired
    ReclamationRepository RepRecl;
    @Override
    public Reclamation AjouterReclamation(Reclamation reclamation) {
        return RepRecl.save(reclamation);
    }

    @Override
    public void DeleteReclamation(Reclamation reclamation) {
        RepRecl.delete(reclamation);
    }

    @Override
    public void DeleteReclamation(Integer idRec) {
        RepRecl.deleteById(idRec);
    }

    @Override
    public List<Reclamation> getAllReclamation() {
        return (List<Reclamation>) RepRecl.findAll();
    }
}
