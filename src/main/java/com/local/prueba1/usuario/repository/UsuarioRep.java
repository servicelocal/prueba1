package com.local.prueba1.usuario.repository;

import com.local.prueba1.usuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRep extends JpaRepository<Usuario, Integer> {
}
