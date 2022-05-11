package com.example.consomi.services;

import com.example.consomi.dto.dtoeventtaux;
import com.example.consomi.entity.Cagnotte;
import com.example.consomi.entity.Event;
import com.example.consomi.entity.User;
import com.example.consomi.repositories.CagnotteRepository;
import com.example.consomi.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.example.consomi.repositories.EventRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

@Repository
@Service
@Slf4j
public class EventService {

    @Autowired
    EventRepository er ;
    @Autowired
    CagnotteRepository cr ;
    @Autowired
    UserRepository ur;
    public Event addEvent(){
        Event e=new Event();
        e.setDateEvent(new Date());
        return er.save(e);
    }
    public void addEventWithDetails(Event event ){
        er.save(event);
    }

    public void deleteEvent(int idEvent){
        er.delete(er.findById(idEvent).get());
    }

    public List<Event> findall (){
        return er.findAll();
    }

    public Event affecterCagnotteParticipant(int idEvent , int idCagnotte, int idUser ){
        Event e = er.findById(idEvent).get();
        List<User> userListEvent= e.getParticipants();
        User cc = ur.findById(idUser).get();
        if(!userListEvent.contains(cc)){
            Cagnotte c = cr.findById(idCagnotte).get();
            /* c.getClients().add(cc);*/
            e.getParticipants().add(cc);
            cc.getEvents().add(e);
            return er.save(e);
        }
        return  null;
    }
    public List<dtoeventtaux> tauxParticipation(){
        List<Event> eventList = new ArrayList<>();
        int taux = 0;
        List<dtoeventtaux> eventTauxList = new ArrayList<>();
        eventList= er.findAll();
        for (Event e: eventList) {
System.out.println(e.getParticipants().size());
 taux= ((e.getParticipants().size()*100/ur.findAll().size()));
            System.out.println(taux);

            eventTauxList.add( convertir(e,Float.valueOf(taux)));
        }
        return  eventTauxList;}
public dtoeventtaux convertir  (Event event , Float taux) {
    dtoeventtaux eventTaux = new dtoeventtaux();
    eventTaux.setValue(taux);
    eventTaux.setName(event.getTitre());
    return eventTaux;
}

}
