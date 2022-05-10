package tn.esprit.spring.repository;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import tn.esprit.spring.entity.Stock;

@Repository
public interface StockRepository extends CrudRepository<Stock, Long>
{
	@Query("Select s from Stock s where s.quantity !=0 order by s.quantity ASC")
	List<Stock> findAllOrderByquantity();
	
}
