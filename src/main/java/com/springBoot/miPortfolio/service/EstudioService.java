package com.springBoot.miPortfolio.service;

import com.springBoot.miPortfolio.model.Estudio;
import java.util.List;

public interface EstudioService {
 
    public List<Estudio> verEstudios();
    
    public void crearEstudio(Estudio est);
    
    public void borrarEstudio(Long id);
    
    public Estudio buscarEstudio(Long id);
    
    public Estudio traerEstudio(Long id);
    
}
