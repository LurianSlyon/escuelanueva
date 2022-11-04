/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuealanueva.EscuelaNueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuealanueva.EscuelaNueva.entity.ApoderadoEntity;

/**
 *
 * @author Lurian
 */
public interface ApoderadoService {
    //Funcion que permita mostrar todos los datos
    List<ApoderadoEntity> findAll();
    //Funcion que permite mostrar todos los datos habilitados
    List<ApoderadoEntity> findAllCustom();
    //Funcion para poder buscar por codigo
    Optional<ApoderadoEntity> findById(Long id);
    //Funcion para registrar datos
    ApoderadoEntity add(ApoderadoEntity d);   
    //Funcion para actualizar
    ApoderadoEntity update(ApoderadoEntity d);
    //Funcion para eliminar
    ApoderadoEntity delete(ApoderadoEntity d);
}
