package com.example.consomi.repositories;

import com.example.consomi.entity.Cagnotte;
import com.example.consomi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CagnotteRepository extends JpaRepository<Cagnotte,Integer> {
    @Query("select C.clients from Cagnotte C")
    List<User> getWinner();
}
