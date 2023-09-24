package com.springBoot.miPortfolio.controller;

import com.springBoot.miPortfolio.model.Estudio;
import com.springBoot.miPortfolio.model.Proyecto;
import com.springBoot.miPortfolio.model.Skill;
import com.springBoot.miPortfolio.model.Trabajo;
import com.springBoot.miPortfolio.model.Usuario;
import com.springBoot.miPortfolio.service.IEstudioService;
import com.springBoot.miPortfolio.service.IProyectoService;
import com.springBoot.miPortfolio.service.ISkillService;
import com.springBoot.miPortfolio.service.ITrabajoService;
import com.springBoot.miPortfolio.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    //MÉTODOS DE "ESTUDIO"
    @Autowired
    private IEstudioService estudioServ;
    
    @PostMapping("/estudio")
    public void agregarEstudio(@RequestBody Estudio est){
        estudioServ.crearEstudio(est);
    }
    
    @GetMapping("/estudio")
    public List<Estudio> verEstudios(){
        return estudioServ.verEstudios();
    }
    
    @DeleteMapping("/estudio/{id}")
    public void borrarEstudio(@PathVariable Long id){
        estudioServ.borrarEstudio(id);
    }
    
    @PutMapping("/estudio/{id}")
    public void editarEstudio(@PathVariable Long id,
                              @RequestBody Estudio estudioFinal){
        Estudio estudioEditar=estudioServ.traerEstudio(id);
        estudioEditar.setTitulo(estudioFinal.getTitulo());
        estudioEditar.setInstitucion(estudioFinal.getInstitucion());
        estudioEditar.setPeriodo(estudioFinal.getPeriodo());
        estudioEditar.setFotoEstudio(estudioFinal.getFotoEstudio());
        estudioEditar.setCertificado(estudioFinal.getCertificado());
        
        estudioServ.crearEstudio(estudioEditar);
    }
    
    //MÉTODOS DE "PROYECTO"
    @Autowired
    private IProyectoService proyectoServ;
    
    @PostMapping("/proyecto")
    public void agregarProyecto(@RequestBody Proyecto proy){
        proyectoServ.crearProyecto(proy);
    }
    
    @GetMapping("/proyecto")
    public List<Proyecto> verProyectos(){
        return proyectoServ.verProyectos();
    }
    
    @DeleteMapping("/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyectoServ.borrarProyecto(id);
    }
    
    @PutMapping("/proyecto/{id}")
    public void editarProyecto(@PathVariable Long id,
                              @RequestBody Proyecto proyectoFinal){
        Proyecto proyectoEditar=proyectoServ.traerProyecto(id);
        proyectoEditar.setNombre(proyectoFinal.getNombre());
        proyectoEditar.setFecha(proyectoFinal.getFecha());
        proyectoEditar.setDescripcion(proyectoFinal.getDescripcion());
        proyectoEditar.setFotoProyecto(proyectoFinal.getFotoProyecto());
        proyectoEditar.setUrl(proyectoFinal.getUrl());
        
        proyectoServ.crearProyecto(proyectoEditar);
    }
    
    //MÉTODOS DE "SKILL"
    @Autowired
    private ISkillService skillServ;
    
    @PostMapping("/skill")
    public void agregarSkill(@RequestBody Skill ski){
        skillServ.crearSkill(ski);
    }
    
    @GetMapping("/skill")
    public List<Skill> verSkills(){
        return skillServ.verSkills();
    }
    
    @DeleteMapping("/skill/{id}")
    public void borrarSkill(@PathVariable Long id){
        skillServ.borrarSkill(id);
    }
    
    @PutMapping("/skill/{id}")
    public void editarSkill(@PathVariable Long id,
                            @RequestBody Skill skillFinal){
        Skill skillEditar=skillServ.traerSkill(id);
        skillEditar.setNombre(skillFinal.getNombre());
        skillEditar.setNivel(skillFinal.getNivel());
        skillEditar.setUrl(skillFinal.getUrl());
        
        skillServ.crearSkill(skillEditar);
    }
    
    //MÉTODOS DE "TRABAJO"
    @Autowired
    private ITrabajoService trabajoServ;
    
    @PostMapping("/trabajo")
    public void agregarTrabajo(@RequestBody Trabajo tra){
        trabajoServ.crearTrabajo(tra);
    }
    
    @GetMapping("/trabajo")
    public List<Trabajo> verTrabajos(){
        return trabajoServ.verTrabajos();
    }
    
    @DeleteMapping("/trabajo/{id}")
    public void borrarTrabajo(@PathVariable Long id){
        trabajoServ.borrarTrabajo(id);
    }
    
    @PutMapping("/trabajo/{id}")
    public void editarTrabajo(@PathVariable Long id,
                              @RequestBody Trabajo trabajoFinal){
        Trabajo trabajoEditar=trabajoServ.traerTrabajo(id);
        trabajoEditar.setPuesto(trabajoFinal.getPuesto());
        trabajoEditar.setLugar(trabajoFinal.getLugar());
        trabajoEditar.setFechaInicio(trabajoFinal.getFechaInicio());
        trabajoEditar.setFechaFinal(trabajoFinal.getFechaFinal());
        trabajoEditar.setDescripcion(trabajoFinal.getDescripcion());
        trabajoEditar.setFotoLugar(trabajoFinal.getFotoLugar());
        
        trabajoServ.crearTrabajo(trabajoEditar);
    }
    
    //MÉTODOS DE "USUARIO"
    @Autowired
    private IUsuarioService usuarioServ;
    
    @PostMapping("/usuario")
    public void agregarUsuario(@RequestBody Usuario usu){
        usuarioServ.crearUsuario(usu);
    }
    
    @GetMapping("/usuario")
    public List<Usuario> verUsuario(){
        return usuarioServ.verUsuario();
    }
    
    @DeleteMapping("/usuario/{id}")
    public void borrarUsuario(@PathVariable Long id){
        usuarioServ.borrarUsuario(id);
    }
    
    @PutMapping("/usuario/{id}")
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
