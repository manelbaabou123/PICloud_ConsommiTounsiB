package com.example.consomi.controller;

import com.example.consomi.entity.DeliveryMen;
import com.example.consomi.service.DeliveryMenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeliveryMenController {
    @Autowired
    DeliveryMenService deliveryMenService;

    @GetMapping("/DeliveryMen")
    @ResponseBody
    public List<DeliveryMen> getAllDeliveryMen(){
        List<DeliveryMen> deliveryMenList = deliveryMenService.getAllDeliveryMen();
        return deliveryMenList;
    }

    @PostMapping("/AjouterDeliveryMen")
    @ResponseBody
    public DeliveryMen AjouterDeliveryMen(@RequestBody DeliveryMen livreure){
        return deliveryMenService.AjouterDeliveryMen(livreure);
    }

    @DeleteMapping("/DeleteDeliveryMen/{id}")
    @ResponseBody
    public void DeleteDeliveryMen(@PathVariable("id") Integer idDeliveryMen){
        deliveryMenService.DeleteDeliveryMen(idDeliveryMen);
    }

    @GetMapping("/getDeliveryMenStatus/{id}")
    @ResponseBody
    public String getDeliveryMenStatus(@PathVariable("id") Integer idDeliveryMen){
        return deliveryMenService.getDeliveryMenStatus(idDeliveryMen);
    }

    @GetMapping("/getDeliveryMenById/{id}")
    @ResponseBody
    public String getDeliveryMenById(@PathVariable("id") Integer idDeliveryMen){
        return deliveryMenService.getDeliveryMenById(idDeliveryMen);
    }
}
