package com.example.consomi.services;

import com.example.consomi.entity.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.example.consomi.repositories.EventRepository;

import java.util.Date;
import java.util.List;
@Repository
@Service
@Slf4j
public class EventService {

    @Autowired
    EventRepository er ;

    public Event addEvent(){
        Event e=new Event();
        e.setDateEvent(new Date());
        return er.save(e);
    }

    public void deleteEvent(int idEvent){
        er.delete(er.findById(idEvent).get());
    }

    public List<Event> findall (){
        return er.findAll();
    }

}
