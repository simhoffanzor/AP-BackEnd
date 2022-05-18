package com.springBoot.miPortfolio.service;

import com.springBoot.miPortfolio.model.Proyecto;
import java.util.List;

public interface IProyectoService {
 
    public List<Proyecto> verProyectos();
    
    public void crearProyecto(Proyecto proy);
    
    public void borrarProyecto(Long id);
    
    public Proyecto buscarProyecto(Long id);
    
    public Proyecto traerProyecto(Long id);
    
}