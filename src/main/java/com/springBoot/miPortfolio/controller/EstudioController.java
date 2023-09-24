package com.springBoot.miPortfolio.controller;

import com.springBoot.miPortfolio.model.Estudio;
import com.springBoot.miPortfolio.service.EstudioService;
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
@RequestMapping("/estudio")
public class EstudioController {
    
    //MÉTODOS DE "ESTUDIO"
    @Autowired
    private EstudioService estudioServ;
    
    @PostMapping
    public void agregarEstudio(@RequestBody Estudio est){
        estudioServ.crearEstudio(est);
    }
    
    @GetMapping
    public List<Estudio> verEstudios(){
        return estudioServ.verEstudios();
    }
    
    @DeleteMapping("/{id}")
    public void borrarEstudio(@PathVariable Long id){
        estudioServ.borrarEstudio(id);
    }
    
    @PutMapping("/{id}")
    public void editarEstudio(@PathVariable Long id,
                              @RequestBody Estudio estudioFinal){
        Estudio estudioEditar=estudioServ.traerEstudio(id);
        estudioEditar.setTitulo(estudioFinal.getTitulo());
        estudioEditar.setInstitucion(estudioFinal.getInstitucion());
        estudioEditar.setPeriodo(estudioFinal.getPeriodo());
        estudioEditar.setFotoEstudio(estudioFinal.getFotoEstudio());
        estudioEditar.setCertificado(estudioFinal.getCertificado());
        
        estudioServ.crearEstudio(estudioEditar);
    }
}
