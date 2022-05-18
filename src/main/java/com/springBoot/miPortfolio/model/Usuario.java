package com.springBoot.miPortfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String descripcion;
    private String titulo;
    private String foto;
    private String github;
    private String linkedin;
    private String twitter;
    private String telefono;
    private String mail;
    private String password;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String apellido, String descripcion, String titulo, String foto, String github, String linkedin, String twitter, String telefono, String mail, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.foto = foto;
        this.github = github;
        this.linkedin = linkedin;
        this.twitter = twitter;
        this.telefono = telefono;
        this.mail = mail;
        this.password = password;
    }

    
    
    
    
}
