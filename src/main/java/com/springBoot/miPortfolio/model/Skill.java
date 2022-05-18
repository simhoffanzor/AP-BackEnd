package com.springBoot.miPortfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private int nivel;
    private String url;

    public Skill() {
    }

    public Skill(Long id, String nombre, int nivel, String url) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.url = url;
    }
    
    
}
