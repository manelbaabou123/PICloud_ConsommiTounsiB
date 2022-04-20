package com.example.consomi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.consomi.entity.Advertising;

@Repository
public interface AdvertisingRepository extends JpaRepository<Advertising, Integer>{
	
	@Query("SELECT a FROM Advertising a WHERE a.channelAd= :channelAd")
	Advertising findAdvertisingByChannel(@Param("channelAd") String channelAd);

}
