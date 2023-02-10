package com.example.prueba.servicios;

import com.example.prueba.modelo.usuario;
import com.example.prueba.repositorio.RepositorioUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@AllArgsConstructor
public class servicioUsuariolmpi implements servicioUsuario{

    private final RepositorioUsuario repositorioUsuario;
    @Override
    public usuario guardarUsuario(usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    @Override
    public Optional<usuario> obtenerUsuario(Long idUsuario) {
        return repositorioUsuario.findById(idUsuario);
    }

    @Override
    public usuario usuarioAModificar(Long id, usuario usuarioAModificar) {
        usuario usuarioBuscado = repositorioUsuario.findById(id).get();
        usuarioBuscado.setDireccion(usuarioAModificar.getDireccion());
        return repositorioUsuario.save(usuarioBuscado);
    }

    @Override
    public boolean eliminarUsuario(Long id) {
        try {
            repositorioUsuario.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
