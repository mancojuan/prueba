package com.example.prueba.servicios;

import com.example.prueba.modelo.usuario;

import java.util.Optional;

public interface servicioUsuario {

    usuario guardarUsuario(usuario usuario);

    Optional<usuario> obtenerUsuario(Long idUsuario);

    usuario usuarioAModificar(Long id,usuario usuarioAModificar);

    boolean eliminarUsuario(Long id);
}
