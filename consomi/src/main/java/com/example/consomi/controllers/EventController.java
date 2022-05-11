package com.example.consomi.controllers;

import com.example.consomi.dto.dtoeventtaux;
import com.example.consomi.entity.Cagnotte;
import com.example.consomi.entity.Event;
import com.example.consomi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.consomi.repositories.EventRepository;
import com.example.consomi.services.EventService;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class EventController {

    @Autowired
    EventService es;
    @Autowired
    EventRepository er;

    @PostMapping("/addEvent")
    @ResponseBody
    public Event addEvent() {
        return es.addEvent();
    }

    @DeleteMapping("/deleteEvent/{id}")
    @ResponseBody
    public void deleteEvent(@PathVariable("id") int idEvent) {
        es.deleteEvent(idEvent);
    }

    @GetMapping("/getallEvent")
    @ResponseBody
    public List<Event> findall() {
        return es.findall();
    }


    @PutMapping("/affecterEvent/{ide}/{idc}/{idUser}")
    @ResponseBody
    public Event affecterCagnotteParticipant(@PathVariable("ide") int idEvent, @PathVariable("idc") int idCagnotte, @PathVariable
            ("idUser") int idUser) {
        return es.affecterCagnotteParticipant(idEvent, idCagnotte, idUser);
    }

    @PostMapping("/addEventWithdetails")
    @ResponseBody
    public void addEventWithDetails(@RequestBody Event event) {
        es.addEventWithDetails(event);
    }


    @GetMapping("/gettaux")
    @ResponseBody
    public List<dtoeventtaux> tauxParticipation() {
        return es.tauxParticipation();
    }
}