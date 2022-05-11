package com.example.consomi.repositories;

import com.example.consomi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.consomi.entity.Event;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event,Integer> {

}
