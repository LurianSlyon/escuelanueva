/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.apiescuealanueva.EscuelaNueva.controllers;

import pe.com.apiescuealanueva.EscuelaNueva.entity.ProgramacionesEntity;
import pe.com.apiescuealanueva.EscuelaNueva.service.ProgramacionService;
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

@RestController
@RequestMapping("/programa")
public class ProgramacionController {
    @Autowired
    private  ProgramacionService programacionService;
    @GetMapping
    public List<ProgramacionesEntity>findAll(){
        return programacionService.findAll();
    }

    @GetMapping("/cust")
    public List<ProgramacionesEntity> findAllCustom(){
        return  programacionService.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<ProgramacionesEntity> findById(@PathVariable Long id){
        return  programacionService.findById(id);
    }
    @PostMapping
    public ProgramacionesEntity add(@RequestBody ProgramacionesEntity d){
        return programacionService.add(d);
    }
    @PutMapping("/{id}")
    public ProgramacionesEntity update(@PathVariable Long id, @RequestBody ProgramacionesEntity d){
        d.setCodigop(id);
        return programacionService.update(d);
    }
    @DeleteMapping("/{id}")
    public ProgramacionesEntity update(@PathVariable Long id){
        ProgramacionesEntity obProgramacionesEntity = new ProgramacionesEntity();
        obProgramacionesEntity.setEstadop(false);
        return  programacionService.delete(ProgramacionesEntity.builder().codigop(id).build());
    }
    
}
