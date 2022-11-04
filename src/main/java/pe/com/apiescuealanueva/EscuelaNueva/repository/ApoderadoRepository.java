/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuealanueva.EscuelaNueva.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apiescuealanueva.EscuelaNueva.entity.ApoderadoEntity;

/**
 *
 * @author Lurian
 */
public interface ApoderadoRepository extends JpaRepository<ApoderadoEntity, Long>  {
    @Query("select a from ApoderadoEntity a where a.estado='1'")
    List<ApoderadoEntity> findAllCustom();
}