package pe.com.apiescuealanueva.EscuelaNueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.apiescuealanueva.EscuelaNueva.entity.ParentescoEntity;
import pe.com.apiescuealanueva.EscuelaNueva.repository.ParentescoRepository;

/**
 *
 * @author Lurian
 */
@Service
public class ParentescoServiceImpl implements ParentescoService {

    @Autowired
    private ParentescoRepository parentescorepository;

    
    @Override
    public List<ParentescoEntity> findAll() {
        return parentescorepository.findAll();
    }

    @Override
    public List<ParentescoEntity> findAllCustom() {
        return parentescorepository.findAllCustom();
    }

    @Override
    public Optional<ParentescoEntity> findById(Long id) {
        return parentescorepository.findById(id);
    }

    @Override
    public ParentescoEntity add(ParentescoEntity p) {
        return parentescorepository.save(p);
    }

    @Override
    public ParentescoEntity update(ParentescoEntity p) {
        ParentescoEntity objparentesco=parentescorepository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objparentesco);
        return parentescorepository.save(objparentesco);
    }

    @Override
    public ParentescoEntity delete(ParentescoEntity p) {
        ParentescoEntity objparentesco=parentescorepository.getById(p.getCodigo());
        objparentesco.setEstado(false);
        return parentescorepository.save(objparentesco);
    }
    
}
