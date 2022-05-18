package com.springBoot.miPortfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String fecha;
    private String descripcion;
    private String fotoProyecto;
    private String url;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String fecha, String descripcion, String fotoProyecto, String url) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.fotoProyecto = fotoProyecto;
        this.url = url;
    }
    
    
}
