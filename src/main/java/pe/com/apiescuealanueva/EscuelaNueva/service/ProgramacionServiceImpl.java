/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.apiescuealanueva.EscuelaNueva.service;

import pe.com.apiescuealanueva.EscuelaNueva.entity.ProgramacionesEntity;
import pe.com.apiescuealanueva.EscuelaNueva.repository.ProgramacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lurian
 */
@Service
public class ProgramacionServiceImpl implements ProgramacionService {
    @Autowired
    private ProgramacionRepository programacionRepository;

    @Override
    public List<ProgramacionesEntity> findAll() {
        return programacionRepository.findAll();
    }

    @Override
    public List<ProgramacionesEntity> findAllCustom() {
        return programacionRepository.findAllCustom();
    }

    @Override
    public Optional<ProgramacionesEntity> findById(Long id) {
        return programacionRepository.findById(id);
    }

    @Override
    public ProgramacionesEntity add(ProgramacionesEntity a) {
        return programacionRepository.save(a);
    }

    @Override
    public ProgramacionesEntity update(ProgramacionesEntity a) {
        ProgramacionesEntity objpr=programacionRepository.getById(a.getCodigop());
        BeanUtils.copyProperties(a, objpr);
        return programacionRepository.save(objpr);
    }

    @Override
    public ProgramacionesEntity delete(ProgramacionesEntity a) {
        ProgramacionesEntity objPr=programacionRepository.getById(a.getCodigop());
        objPr.setEstadop(false);
        return programacionRepository.save(objPr);
    }
}
