package com.example.consomi.controller;

import com.example.consomi.entity.Delivery;
import com.example.consomi.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
//@RequiredArgsConstructor
@RequestMapping("/Delivery")
public class DeliveryController {
    @Autowired
    DeliveryService deliveryService;


    //@GetMapping("/Delivery")
    @GetMapping("/all")
    @ResponseBody
    public List<Delivery> getAllDelivery(){
        List<Delivery> deliveryList = deliveryService.getAllDelivery();
        return deliveryList;
    }

    @PostMapping("/add")
    @ResponseBody
    public Delivery AddDelivery(@RequestBody Delivery delivery){
        return deliveryService.AddDelivery(delivery);
    }

    @PutMapping("/Update")
    @ResponseBody
    public Delivery UpdateDelivery(@RequestBody Delivery delivery){
        return deliveryService.UpdateDelivery(delivery);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void DeleteDelivery(@PathVariable("id") Long idDelivery){
        deliveryService.DeleteDelivery(idDelivery);
    }

    @GetMapping("/getStatus/{id}")
    @ResponseBody
    public String getDeliveryStatus(@PathVariable("id") Long idDelivery){
        return deliveryService.getDeliveryStatus(idDelivery);
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public String getDeliveryById(@PathVariable("id") Long idDelivery){
        return deliveryService.getDeliveryById(idDelivery);
    }

    @GetMapping("/getCurrent")
    @ResponseBody
    public List<Delivery> getCurrentDeliveries(){
        return deliveryService.getCurrentDeliveries();
    }

    @GetMapping("/getHistory")
    @ResponseBody
    public List<Delivery> getHistoryDeliveries(){
        return deliveryService.getHistoryDeliveries();
    }

    @GetMapping("/countHistory")
    @ResponseBody
    public int countHistoryDeliveries(){
        return deliveryService.getHistoryDeliveries().size();
    }

    @GetMapping("/getCurrentDeliveriesForDeliveryMen/{id}")
    @ResponseBody
    public List<Delivery> getCurrentDeliveriesForDeliveryMen(@PathVariable("id") int idDeliveryMen){
        return deliveryService.getCurrentDeliveriesForDeliveryMen(idDeliveryMen);
    }



    @GetMapping("/getTempsAttente/{idDelivery}")
    @ResponseBody
    public long getTempsAttenteDelivery(@PathVariable("idDelivery") Long idDelivery){
        return deliveryService.getTempsAttenteDelivery(idDelivery);
    }

    @GetMapping("/getTempsAttenteMoyen")
    @ResponseBody
    public long getTempsAttenteMoyen(){
        return deliveryService.getTempsAttenteMoyen();
    }




}
