/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuealanueva.EscuelaNueva.repository;

import pe.com.apiescuealanueva.EscuelaNueva.entity.ProgramacionesEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Lurian
 */
public interface ProgramacionRepository extends JpaRepository<ProgramacionesEntity, Long> {
    @Query("select p from ProgramacionesEntity p where p.estadop='1'")
    List<ProgramacionesEntity> findAllCustom();
}

