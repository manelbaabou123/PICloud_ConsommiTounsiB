package com.example.consomi.controllers;

import com.example.consomi.entity.Cagnotte;
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
    @PutMapping("/affecter/{idu}/{idUseer}/{amount}")
    @ResponseBody
    public Cagnotte affecterAmountClient(@PathVariable("idu") int idCagnotte,@PathVariable("idUser") int idUser ,@PathVariable
            ("amount")int amount){
        return cs.affecterAmountClient(idCagnotte, idUser, amount);
    }

}
