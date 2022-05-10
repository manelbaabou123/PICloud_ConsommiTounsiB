package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import tn.esprit.spring.entity.produit_test;


@Repository
public interface produit_testRepository extends CrudRepository<produit_test, Long>
{

}