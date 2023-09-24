package com.springBoot.miPortfolio.service;

import com.springBoot.miPortfolio.model.Skill;
import java.util.List;

public interface SkillService {
    
    public List<Skill> verSkills();
    
    public void crearSkill(Skill ski);
    
    public void borrarSkill(Long id);
    
    public Skill buscarSkill(Long id);
    
    public Skill traerSkill(Long id);
    
}
