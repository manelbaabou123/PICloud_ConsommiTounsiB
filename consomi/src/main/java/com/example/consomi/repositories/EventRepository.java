package com.example.consomi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.consomi.entity.Event;

@Repository
public interface EventRepository extends JpaRepository<Event,Integer> {
}
