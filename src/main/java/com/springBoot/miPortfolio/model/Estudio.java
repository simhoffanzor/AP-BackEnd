package com.springBoot.miPortfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Estudio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String titulo;
    private String institucion;
    private String periodo;
    private String fotoEstudio;
    private String certificado;

    public Estudio() {
    }

    public Estudio(Long id, String titulo, String institucion, String periodo, String fotoEstudio, String certificado) {
        this.id = id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.periodo = periodo;
        this.fotoEstudio = fotoEstudio;
        this.certificado = certificado;
    }
    
    
}
