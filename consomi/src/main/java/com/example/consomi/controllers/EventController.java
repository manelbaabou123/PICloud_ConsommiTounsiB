package com.example.consomi.controllers;

import com.example.consomi.entity.Event;
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
    EventService es ;
    @Autowired
    EventRepository er ;
    @PostMapping ("/addEvent")
    @ResponseBody
    public Event addEvent() {
        return es.addEvent();
    }

    @DeleteMapping("/deleteEvent/{id}")
    @ResponseBody
    public void deleteEvent(@PathVariable("id") int idEvent) {
        es.deleteEvent(idEvent);
    }

    @GetMapping("/getall")
    @ResponseBody
    public List<Event> findall (){
        return es.findall();
    }

}
