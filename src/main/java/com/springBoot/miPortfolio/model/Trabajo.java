package com.springBoot.miPortfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Trabajo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String puesto;
    private String lugar;
    private String fechaInicio;
    private String fechaFinal;
    private String descripcion;
    private String fotoLugar;

    public Trabajo() {
    }

    public Trabajo(Long id, String puesto, String lugar, String fechaInicio, String fechaFinal, String descripcion, String fotoLugar) {
        this.id = id;
        this.puesto = puesto;
        this.lugar = lugar;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.descripcion = descripcion;
        this.fotoLugar = fotoLugar;
    }
    
    
}
