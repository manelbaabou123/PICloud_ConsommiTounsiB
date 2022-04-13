package tn.esprit.pi_dev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pi_dev.entities.Cagnotte;
import tn.esprit.pi_dev.services.CagnotteService;
import tn.esprit.pi_dev.services.DonationService;

import java.util.List;

@RestController
@RequestMapping("/")
public class CagnotteController {
    @Autowired
    CagnotteService cs;

    @Autowired
    DonationService ds;

    @PostMapping("/addCagnotte")
    @ResponseBody
    public Cagnotte addCagnote(@RequestBody Cagnotte c) {
        return cs.addCagnote(c);
    }
    @PostMapping("/affecter/{idc}/{idclient}/{amount}")
    @ResponseBody
    public Cagnotte affecterAmountClient(@PathVariable("idc") int idCagnotte,@PathVariable("idclient") int idClient ,@PathVariable
            ("amount")int amount){
        return cs.affecterAmountClient(idCagnotte, idClient, amount);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCagnotte(int idCagnote) {
        cs.deleteCagnotte(idCagnote);
    }

    @GetMapping("/getall")
    @ResponseBody
    public List<Cagnotte> findall (){
        return cs.findall();
    }




    }
