package com.springBoot.miPortfolio.service;

import com.springBoot.miPortfolio.model.Usuario;
import com.springBoot.miPortfolio.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    public UsuarioRepository usuarioRepo;
    
    @Override
    public List<Usuario> verUsuario() {
        return usuarioRepo.findAll();
    }

    @Override
    public void crearUsuario(Usuario usu) {
        usuarioRepo.save(usu);
    }

    @Override
    public void borrarUsuario(Long id) {
        usuarioRepo.deleteById(id);
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        return usuarioRepo.findById(id).orElse(null);
    }

    @Override
    public Usuario traerUsuario(Long id) {
        return usuarioRepo.getById(id);
    }
    
}
