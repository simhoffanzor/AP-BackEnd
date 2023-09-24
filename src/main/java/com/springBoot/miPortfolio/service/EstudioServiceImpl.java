package com.springBoot.miPortfolio.service;

import com.springBoot.miPortfolio.model.Estudio;
import com.springBoot.miPortfolio.repository.EstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioServiceImpl implements EstudioService{

    @Autowired
    public EstudioRepository estudioRepo;
    
    @Override
    public List<Estudio> verEstudios() {
        return estudioRepo.findAll();
    }

    @Override
    public void crearEstudio(Estudio est) {
        estudioRepo.save(est);
    }

    @Override
    public void borrarEstudio(Long id) {
        estudioRepo.deleteById(id);
    }

    @Override
    public Estudio buscarEstudio(Long id) {
        return estudioRepo.findById(id).orElse(null);
    }

    @Override
    public Estudio traerEstudio(Long id) {
        return estudioRepo.getById(id);
    }
    
}
