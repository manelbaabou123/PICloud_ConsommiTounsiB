package com.example.consomi.repositories;

import com.example.consomi.entity.Cagnotte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface CagnotteRepository extends JpaRepository<Cagnotte,Integer> {
}
