package com.example.consomi.controller;

import com.example.consomi.entity.Delivery;
import com.example.consomi.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeliveryController {
    @Autowired
    DeliveryService deliveryService;

    @GetMapping("/Delivery")
    @ResponseBody
    public List<Delivery> getAllDelivery(){
        List<Delivery> deliveryList = deliveryService.getAllDelivery();
        return deliveryList;
    }

    @PostMapping("/AjouterDelivery")
    @ResponseBody
    public Delivery AjouterDelivery(@RequestBody Delivery livraison){
        return deliveryService.AjouterDelivery(livraison);
    }

    @DeleteMapping("/DeleteDelivery/{id}")
    @ResponseBody
    public void DeleteDelivery(@PathVariable("id") Long idDelivery){
        deliveryService.DeleteDelivery(idDelivery);
    }

    @GetMapping("/getDeliveryStatus/{id}")
    @ResponseBody
    public String getDeliveryStatus(@PathVariable("id") Long idDelivery){
        return deliveryService.getDeliveryStatus(idDelivery);
    }

    @GetMapping("/getDeliveryById/{id}")
    @ResponseBody
    public String getDeliveryById(@PathVariable("id") Long idDelivery){
        return deliveryService.getDeliveryById(idDelivery);
    }

    @GetMapping("/getCurrentDeliveries")
    @ResponseBody
    public List<Delivery> getCurrentDeliveries(){
        return deliveryService.getCurrentDeliveries();
    }

    @GetMapping("/getHistoryDeliveries")
    @ResponseBody
    public List<Delivery> getHistoryDeliveries(){
        return deliveryService.getHistoryDeliveries();
    }

    @GetMapping("/countHistoryDeliveries")
    @ResponseBody
    public int countHistoryDeliveries(){
        return deliveryService.getHistoryDeliveries().size();
    }


    @GetMapping("/getCurrentDeliveriesForDeliveryMen/{id}")
    @ResponseBody
    public List<Delivery> getCurrentDeliveriesForDeliveryMen(@PathVariable("id") int idDeliveryMen){
        return deliveryService.getCurrentDeliveriesForDeliveryMen(idDeliveryMen);
    }
}
