package com.example.consomi.controller;

import com.example.consomi.entity.Delivery;
import com.example.consomi.entity.DeliveryMan;
import com.example.consomi.service.DeliveryManService;
import com.example.consomi.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeliveryManController {
    @Autowired
    DeliveryManService deliveryManService;

    @GetMapping("/DeliveryMan")
    @ResponseBody
    public List<DeliveryMan> getAllDeliveryMan(){
        List<DeliveryMan> deliveryManList = deliveryManService.getAllDeliveryMan();
        return deliveryManList;
    }

    @PostMapping("/AjouterDeliveryMan")
    @ResponseBody
    public DeliveryMan AjouterDeliveryMan(@RequestBody DeliveryMan livreure){
        return deliveryManService.AjouterDeliveryMan(livreure);
    }

    @DeleteMapping("/DeleteDeliveryMan/{id}")
    @ResponseBody
    public void DeleteDeliveryMan(@PathVariable("id") Integer idDeliveryMan){
        deliveryManService.DeleteDeliveryMan(idDeliveryMan);
    }

    @GetMapping("/getDeliveryManStatus/{id}")
    @ResponseBody
    public String getDeliveryManStatus(@PathVariable("id") Integer idDeliveryMan){
        return deliveryManService.getDeliveryManStatus(idDeliveryMan);
    }

    @GetMapping("/getDeliveryManById/{id}")
    @ResponseBody
    public String getDeliveryManById(@PathVariable("id") Integer idDeliveryMan){
        return deliveryManService.getDeliveryManById(idDeliveryMan);
    }
}
