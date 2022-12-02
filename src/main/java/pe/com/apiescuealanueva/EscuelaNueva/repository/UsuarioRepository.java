/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuealanueva.EscuelaNueva.repository;

import pe.com.apiescuealanueva.EscuelaNueva.entity.UsuarioEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Lurian
 */
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>  {
    @Query("select u from UsuarioEntity u where u.estadou='1'")
    List<UsuarioEntity> findAllCustom();
}
