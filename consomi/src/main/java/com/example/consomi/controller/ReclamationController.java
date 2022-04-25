package com.example.consomi.controller;

import com.example.consomi.entity.Reclamation;
import com.example.consomi.service.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Reclamation")
public class ReclamationController {


    @Autowired
    ReclamationService ServRec;


    @PostMapping("/add")
    @ResponseBody
    public Reclamation addReclamation(@RequestBody Reclamation reclamation ) {
        return ServRec.addReclamation(reclamation);

    }


    @GetMapping("/getAll")
    @ResponseBody
    public List<Reclamation> getAllReclamations() {
        return ServRec.getAllReclamations();

    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void DeleteReclamtion(@PathVariable("id") Integer idRec){
        ServRec.DeleteReclamation(idRec);
    }



    /*@GetMapping("/getReclamationsTraitees")
    @ResponseBody
    public List<Reclamation> getReclamationsTraitees() {
        return ServRec.getReclamationsTraitee();

    }

    @GetMapping("/getReclamationsNonTraitees")
    @ResponseBody
    public List<Reclamation> getReclamationsNonTraitees() {
        return ServRec.getReclamationsNonTraitees();

    }

    @GetMapping("/getReclamationsEnCours")
    @ResponseBody
    public List<Reclamation> getReclamationsEnCours() {
        return ServRec.getReclamationsEnCours();

    }*/

   /* @GetMapping("/getReclamationsByClient/{idClient}")
    @ResponseBody
    public List<Reclamation> getReclamationsByClient(@PathVariable("idClient") int idClient) {
        return ServRec.getReclamationsByClient(idClient);

    }*/


   /* @GetMapping("/getReclamationsByLivreur")
    @ResponseBody
    public List<ReclamationLivreurStat> getReclamationsByLivreur() {
        return ServRec.getReclamationsByLivreur();

    }
*/

    /*@PutMapping("/marquerEnCours/{idReclamation}")
    @ResponseBody
    public void marquerEnCours(@PathVariable("idReclamation") int idReclamation)
    {
        ServRec.marquerEnCours(idReclamation);
    }*/

   /* @PutMapping("/marquerTraitee/{idReclamation}")
    @ResponseBody
    public void marquerTraitee(@PathVariable("idReclamation") int idReclamation)
    {
        ServRec.marquerTraitee(idReclamation);
    }

    @PutMapping("/marquerNonTraitee/{idReclamation}")
    @ResponseBody
    public void marquerNonTraitee(@PathVariable("idReclamation") int idReclamation)
    {
        ServRec.marquerNonTraitee(idReclamation);
    }

    */

}
