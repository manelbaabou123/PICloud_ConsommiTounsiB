package com.example.consomi.service;

import com.example.consomi.entity.Reclamation;

import java.util.List;

public interface ReclamationService {
    Reclamation addReclamation(Reclamation reclamation);
    void DeleteReclamation(Integer idRec);
    List<Reclamation> getAllReclamation();
    public List<Reclamation> getAllReclamations();
}
