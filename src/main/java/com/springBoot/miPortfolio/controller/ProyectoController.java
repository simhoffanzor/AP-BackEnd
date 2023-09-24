package com.springBoot.miPortfolio.controller;

import com.springBoot.miPortfolio.model.Proyecto;
import com.springBoot.miPortfolio.service.ProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
    
    //MÉTODOS DE "PROYECTO"
    @Autowired
    private ProyectoService proyectoServ;
    
    @PostMapping
    public void agregarProyecto(@RequestBody Proyecto proy){
        proyectoServ.crearProyecto(proy);
    }
    
    @GetMapping
    public List<Proyecto> verProyectos(){
        return proyectoServ.verProyectos();
    }
    
    @DeleteMapping("/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyectoServ.borrarProyecto(id);
    }
    
    @PutMapping("/{id}")
    public void editarProyecto(@PathVariable Long id,
                              @RequestBody Proyecto proyectoFinal){
        Proyecto proyectoEditar=proyectoServ.traerProyecto(id);
        proyectoEditar.setNombre(proyectoFinal.getNombre());
        proyectoEditar.setFecha(proyectoFinal.getFecha());
        proyectoEditar.setDescripcion(proyectoFinal.getDescripcion());
        proyectoEditar.setFotoProyecto(proyectoFinal.getFotoProyecto());
        proyectoEditar.setUrl(proyectoFinal.getUrl());
        
        proyectoServ.crearProyecto(proyectoEditar);
    }
}
