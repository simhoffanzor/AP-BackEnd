package com.springBoot.miPortfolio.service;

import com.springBoot.miPortfolio.model.Usuario;
import java.util.List;

public interface IUsuarioService {
    
    public List<Usuario> verUsuario();
    
    public void crearUsuario(Usuario usu);
    
    public void borrarUsuario(Long id);
    
    public Usuario buscarUsuario(Long id);
    
    public Usuario traerUsuario(Long id);
    
}
