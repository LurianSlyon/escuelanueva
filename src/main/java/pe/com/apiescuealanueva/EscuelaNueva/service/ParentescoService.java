package pe.com.apiescuealanueva.EscuelaNueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuealanueva.EscuelaNueva.entity.ParentescoEntity;

/**
 *
 * @author Lurian
 */
public interface ParentescoService {
    //Funcion que permita mostrar todos los datos
    List<ParentescoEntity> findAll();
    //Funcion que permite mostrar todos los datos habilitados
    List<ParentescoEntity> findAllCustom();
    //Funcion para poder buscar por codigo
    Optional<ParentescoEntity> findById(Long id);
    //Funcion para registrar datos
    ParentescoEntity add(ParentescoEntity d);   
    //Funcion para actualizar
    ParentescoEntity update(ParentescoEntity d);
    //Funcion para eliminar
    ParentescoEntity delete(ParentescoEntity d);
}
