package com.springBoot.miPortfolio.service;

import com.springBoot.miPortfolio.model.Trabajo;
import java.util.List;

public interface TrabajoService {
 
    public List<Trabajo> verTrabajos();
    
    public void crearTrabajo(Trabajo tra);
    
    public void borrarTrabajo(Long id);
    
    public Trabajo buscarTrabajo(Long id);
    
    public Trabajo traerTrabajo(Long id);
    
}
