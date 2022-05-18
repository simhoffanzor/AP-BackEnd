package com.springBoot.miPortfolio.repository;

import com.springBoot.miPortfolio.model.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabajoRepository extends JpaRepository<Trabajo, Long>{
    
}
