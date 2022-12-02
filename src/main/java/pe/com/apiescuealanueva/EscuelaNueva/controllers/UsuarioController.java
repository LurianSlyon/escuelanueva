/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.apiescuealanueva.EscuelaNueva.controllers;

import pe.com.apiescuealanueva.EscuelaNueva.entity.UsuarioEntity;
import pe.com.apiescuealanueva.EscuelaNueva.service.UsuarioService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lurian
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private  UsuarioService usuarioService;
    @GetMapping
    public List<UsuarioEntity>findAll(){
        return usuarioService.findAll();
    }

    @GetMapping("/cust")
    public List<UsuarioEntity> findAllCustom(){
        return  usuarioService.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<UsuarioEntity> findById(@PathVariable Long id){
        return  usuarioService.findById(id);
    }
    @PostMapping
    public UsuarioEntity add(@RequestBody UsuarioEntity d){
        return usuarioService.add(d);
    }
    @PutMapping("/{id}")
    public UsuarioEntity update(@PathVariable Long id, @RequestBody UsuarioEntity d){
        d.setCodigou(id);
        return usuarioService.update(d);
    }
    @DeleteMapping("/{id}")
    public UsuarioEntity update(@PathVariable Long id){
        UsuarioEntity obUsuarioEntity = new UsuarioEntity();
        obUsuarioEntity.setEstadou(false);
        return  usuarioService.delete(UsuarioEntity.builder().codigou(id).build());
    }
    
}
