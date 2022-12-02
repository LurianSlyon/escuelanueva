/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuealanueva.EscuelaNueva.service;

import pe.com.apiescuealanueva.EscuelaNueva.entity.ProgramacionesEntity;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Lurian
 */
public interface ProgramacionService {
    //Funcion que permita mostrar todos los datos
    List<ProgramacionesEntity> findAll();
    //Funcion que permite mostrar todos los datos habilitados
    List<ProgramacionesEntity> findAllCustom();
    //Funcion para poder buscar por codigo
    Optional<ProgramacionesEntity> findById(Long id);
    //Funcion para registrar datos
    ProgramacionesEntity add(ProgramacionesEntity d);   
    //Funcion para actualizar
    ProgramacionesEntity update(ProgramacionesEntity d);
    //Funcion para eliminar
    ProgramacionesEntity delete(ProgramacionesEntity d);    
}
