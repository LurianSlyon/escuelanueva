package pe.com.apiescuealanueva.EscuelaNueva.service;

import pe.com.apiescuealanueva.EscuelaNueva.entity.UsuarioEntity;
import pe.com.apiescuealanueva.EscuelaNueva.repository.UsuarioRepository;
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
public class UsuarioServiceImpl implements UsuarioService  {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<UsuarioEntity> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public List<UsuarioEntity> findAllCustom() {
        return usuarioRepository.findAllCustom();
    }

    @Override
    public Optional<UsuarioEntity> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public UsuarioEntity add(UsuarioEntity a) {
        return usuarioRepository.save(a);
    }

    @Override
    public UsuarioEntity update(UsuarioEntity a) {
        UsuarioEntity objusu=usuarioRepository.getById(a.getCodigou());
        BeanUtils.copyProperties(a, objusu);
        return usuarioRepository.save(objusu);
    }

    @Override
    public UsuarioEntity delete(UsuarioEntity a) {
        UsuarioEntity objusu=usuarioRepository.getById(a.getCodigou());
        objusu.setEstadou(false);
        return usuarioRepository.save(objusu);
    }
}
