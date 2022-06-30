package com.local.prueba1.usuario.service;

import com.local.prueba1.usuario.model.Usuario;
import com.local.prueba1.usuario.repository.UsuarioRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServImp implements UsuarioServ {

    @Autowired
    UsuarioRep usuarioRep;

    @Override
    public Optional<Usuario> forId(Integer id) {
        return usuarioRep.findById(id);
    }

    @Override
    public List<Usuario> list() {
        return usuarioRep.findAll();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRep.save(usuario);
    }

    @Override
    public Boolean deleteForId(Integer id) {
        try {
            usuarioRep.deleteById(id);
            return true;

        } catch (Exception ex) {
            return false;
        }
    }

}
