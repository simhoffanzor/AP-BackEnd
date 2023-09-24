package com.springBoot.miPortfolio.controller;

import com.springBoot.miPortfolio.model.Usuario;
import com.springBoot.miPortfolio.service.IUsuarioService;
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
@RequestMapping("/usuario")
public class UsuarioController {

    //MÉTODOS DE "USUARIO"
    @Autowired
    private IUsuarioService usuarioServ;
    
    @PostMapping
    public void agregarUsuario(@RequestBody Usuario usu){
        usuarioServ.crearUsuario(usu);
    }
    
    @GetMapping
    public List<Usuario> verUsuario(){
        return usuarioServ.verUsuario();
    }
    
    @DeleteMapping("/{id}")
    public void borrarUsuario(@PathVariable Long id){
        usuarioServ.borrarUsuario(id);
    }
    
    @PutMapping("/{id}")
    public void editarUsuario(@PathVariable Long id,
                              @RequestBody Usuario usuarioFinal){
        Usuario usuarioEditar=usuarioServ.traerUsuario(id);
        usuarioEditar.setNombre(usuarioFinal.getNombre());
        usuarioEditar.setApellido(usuarioFinal.getApellido());
        usuarioEditar.setFoto(usuarioFinal.getFoto());
        usuarioEditar.setDescripcion(usuarioFinal.getDescripcion());
        usuarioEditar.setTitulo(usuarioFinal.getTitulo());
        usuarioEditar.setGithub(usuarioFinal.getGithub());
        usuarioEditar.setLinkedin(usuarioFinal.getLinkedin());
        usuarioEditar.setTwitter(usuarioFinal.getTwitter());
        usuarioEditar.setTelefono(usuarioFinal.getTelefono());
        usuarioEditar.setMail(usuarioFinal.getMail());
        usuarioEditar.setPassword(usuarioFinal.getPassword());
        
        usuarioServ.crearUsuario(usuarioEditar);
    }

}
