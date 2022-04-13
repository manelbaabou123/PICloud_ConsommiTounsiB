package tn.esprit.pi_dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pi_dev.entities.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {
}
