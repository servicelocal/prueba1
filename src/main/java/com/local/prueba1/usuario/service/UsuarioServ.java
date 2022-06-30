package com.local.prueba1.usuario.service;

import com.local.prueba1.usuario.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioServ {

    Optional<Usuario> forId(Integer id);

    List<Usuario> list();

    Usuario save(Usuario usuario);

    Boolean deleteForId(Integer id);

}
