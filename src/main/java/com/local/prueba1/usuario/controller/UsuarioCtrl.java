package com.local.prueba1.usuario.controller;

import com.local.prueba1.usuario.model.Usuario;
import com.local.prueba1.usuario.service.UsuarioServImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioCtrl {

    @Autowired
    UsuarioServImp usuarioServImp;

    @GetMapping(path = "/{id}")
    public Optional<Usuario> forId(@PathVariable("id") Integer id) {
        return usuarioServImp.forId(id);
    }

    @GetMapping()
    public List<Usuario> list() {
        return usuarioServImp.list();
    }

    @PostMapping()
    public Usuario save(@RequestBody Usuario usuario) {
        return usuarioServImp.save(usuario);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteForId(@PathVariable("id") Integer id) {
        Boolean ok = usuarioServImp.deleteForId(id);
        return ok?"Se eliminó el usuario":"No se pudo eliminar el usuario";
    }

}
