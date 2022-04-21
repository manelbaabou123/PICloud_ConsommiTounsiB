package com.example.consomi.repository;

import com.example.consomi.entity.ReponseRec;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReponseRecRepository extends CrudRepository<ReponseRec, Long> {
}
