/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuealanueva.EscuelaNueva.service;

import pe.com.apiescuealanueva.EscuelaNueva.entity.UsuarioEntity;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Lurian
 */
public interface UsuarioService {
    //Funcion que permita mostrar todos los datos
    List<UsuarioEntity> findAll();
    //Funcion que permite mostrar todos los datos habilitados
    List<UsuarioEntity> findAllCustom();
    //Funcion para poder buscar por codigo
    Optional<UsuarioEntity> findById(Long id);
    //Funcion para registrar datos
    UsuarioEntity add(UsuarioEntity d);   
    //Funcion para actualizar
    UsuarioEntity update(UsuarioEntity d);
    //Funcion para eliminar
    UsuarioEntity delete(UsuarioEntity d);
}
