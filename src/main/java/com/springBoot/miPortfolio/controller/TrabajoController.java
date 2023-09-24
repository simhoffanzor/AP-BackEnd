package com.springBoot.miPortfolio.controller;

import com.springBoot.miPortfolio.model.Trabajo;
import com.springBoot.miPortfolio.service.ITrabajoService;
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
@RequestMapping("/trabajo")
public class TrabajoController {
    
    //MÉTODOS DE "TRABAJO"
    @Autowired
    private ITrabajoService trabajoServ;
    
    @PostMapping
    public void agregarTrabajo(@RequestBody Trabajo tra){
        trabajoServ.crearTrabajo(tra);
    }
    
    @GetMapping
    public List<Trabajo> verTrabajos(){
        return trabajoServ.verTrabajos();
    }
    
    @DeleteMapping("/{id}")
    public void borrarTrabajo(@PathVariable Long id){
        trabajoServ.borrarTrabajo(id);
    }
    
    @PutMapping("/{id}")
    public void editarTrabajo(@PathVariable Long id,
                              @RequestBody Trabajo trabajoFinal){
        Trabajo trabajoEditar=trabajoServ.traerTrabajo(id);
        trabajoEditar.setPuesto(trabajoFinal.getPuesto());
        trabajoEditar.setLugar(trabajoFinal.getLugar());
        trabajoEditar.setFechaInicio(trabajoFinal.getFechaInicio());
        trabajoEditar.setFechaFinal(trabajoFinal.getFechaFinal());
        trabajoEditar.setDescripcion(trabajoFinal.getDescripcion());
        trabajoEditar.setFotoLugar(trabajoFinal.getFotoLugar());
        
        trabajoServ.crearTrabajo(trabajoEditar);
    }
}
