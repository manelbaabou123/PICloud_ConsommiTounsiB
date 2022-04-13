package tn.esprit.pi_dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pi_dev.entities.Event;
@Repository
public interface EventRepository extends JpaRepository<Event,Integer> {
}
