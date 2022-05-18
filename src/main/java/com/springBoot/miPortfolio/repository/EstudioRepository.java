package com.springBoot.miPortfolio.repository;

import com.springBoot.miPortfolio.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends JpaRepository<Estudio, Long>{
    
}
