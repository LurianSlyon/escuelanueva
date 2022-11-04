package pe.com.apiescuealanueva.EscuelaNueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuealanueva.EscuelaNueva.entity.DistritoEntity;

/**
 *
 * @author Lurian
 */
public interface DistritoService {
    //Funcion que permita mostrar todos los datos
    List<DistritoEntity> findAll();
    //Funcion que permite mostrar todos los datos habilitados
    List<DistritoEntity> findAllCustom();
    //Funcion para poder buscar por codigo
    Optional<DistritoEntity> findById(Long id);
    //Funcion para registrar datos
    DistritoEntity add(DistritoEntity d);   
    //Funcion para actualizar
    DistritoEntity update(DistritoEntity d);
    //Funcion para eliminar
    DistritoEntity delete(DistritoEntity d);
    
}
