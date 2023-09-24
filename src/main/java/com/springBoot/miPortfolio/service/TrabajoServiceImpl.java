package com.springBoot.miPortfolio.service;

import com.springBoot.miPortfolio.model.Trabajo;
import com.springBoot.miPortfolio.repository.TrabajoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajoServiceImpl implements TrabajoService{
    
    @Autowired
    public TrabajoRepository trabajoRepo;
            
    @Override
    public List<Trabajo> verTrabajos() {
        return trabajoRepo.findAll();
    }

    @Override
    public void crearTrabajo(Trabajo tra) {
        trabajoRepo.save(tra);
    }

    @Override
    public void borrarTrabajo(Long id) {
        trabajoRepo.deleteById(id);
    }

    @Override
    public Trabajo buscarTrabajo(Long id) {
        return trabajoRepo.findById(id).orElse(null);
    }

    @Override
    public Trabajo traerTrabajo(Long id) {
        return trabajoRepo.getById(id);
    }
    
}
