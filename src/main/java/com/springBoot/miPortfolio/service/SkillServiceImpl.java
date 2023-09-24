package com.springBoot.miPortfolio.service;

import com.springBoot.miPortfolio.model.Skill;
import com.springBoot.miPortfolio.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl implements SkillService{

    @Autowired
    public SkillRepository skillRepo;
    
    @Override
    public List<Skill> verSkills() {
        return skillRepo.findAll();
    }

    @Override
    public void crearSkill(Skill ski) {
        skillRepo.save(ski);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill buscarSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public Skill traerSkill(Long id) {
        return skillRepo.getById(id);
    }
    
}
