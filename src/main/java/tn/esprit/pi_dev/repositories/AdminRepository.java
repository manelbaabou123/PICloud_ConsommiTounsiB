package tn.esprit.pi_dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pi_dev.entities.Admin;

import javax.persistence.criteria.CriteriaBuilder;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
}
