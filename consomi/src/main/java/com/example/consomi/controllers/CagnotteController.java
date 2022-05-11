package com.example.consomi.controllers;

import com.example.consomi.entity.Cagnotte;
import com.example.consomi.entity.User;
import com.example.consomi.repositories.CagnotteRepository;
import com.example.consomi.services.CagnotteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class CagnotteController {

    @Autowired
    CagnotteService cs;
    @Autowired
    CagnotteRepository cr;

    @PostMapping("/addCagnotte")
    @ResponseBody
    public Cagnotte addCagnote() {
        return cs.addCagnote();
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteCagnotte(@PathVariable("id") int idCagnote) {
        cs.deleteCagnotte(idCagnote);
    }

    @GetMapping("/getallCagnotte")
    @ResponseBody
    public List<Cagnotte> findall (){
        return cs.findall();
    }


    //mati5dimch//
    @PutMapping("/affecter/{idc}/{idUser}/{amount}")
    @ResponseBody
    public Cagnotte affecterAmountClient(@PathVariable("idc") int idCagnotte,@PathVariable("idUser") int idUser ,@PathVariable
            ("amount")int amount){
        return cs.affecterAmountClient(idCagnotte, idUser, amount);
    }


    @GetMapping("/getWinner")
    @ResponseBody
    public User getWinner(){
        return cs.getWinner();
    }

    @GetMapping("/getTop")
    @ResponseBody
    public User getTop(){
        return cs.getTopDonnater();
    }

    @PutMapping("/retrieveMoney/{idc}/{amount}")
    @ResponseBody
    public Cagnotte retrieveMoney(@PathVariable("idc") int idCagnotte,@PathVariable
            ("amount")int amount){
        return cs.retrieveMoney(idCagnotte,amount);
    }

}
