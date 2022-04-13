package tn.esprit.pi_dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pi_dev.entities.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
