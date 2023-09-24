package com.springBoot.miPortfolio.controller;

import com.springBoot.miPortfolio.model.Skill;
import com.springBoot.miPortfolio.service.SkillService;
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
@RequestMapping("/skill")
public class SkillController {
    
    //MÉTODOS DE "SKILL"
    @Autowired
    private SkillService skillServ;
    
    @PostMapping
    public void agregarSkill(@RequestBody Skill ski){
        skillServ.crearSkill(ski);
    }
    
    @GetMapping
    public List<Skill> verSkills(){
        return skillServ.verSkills();
    }
    
    @DeleteMapping("/{id}")
    public void borrarSkill(@PathVariable Long id){
        skillServ.borrarSkill(id);
    }
    
    @PutMapping("/{id}")
    public void editarSkill(@PathVariable Long id,
                            @RequestBody Skill skillFinal){
        Skill skillEditar=skillServ.traerSkill(id);
        skillEditar.setNombre(skillFinal.getNombre());
        skillEditar.setNivel(skillFinal.getNivel());
        skillEditar.setUrl(skillFinal.getUrl());
        
        skillServ.crearSkill(skillEditar);
    }

}
