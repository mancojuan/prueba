package com.example.prueba.repositorio;

import com.example.prueba.modelo.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface RepositorioUsuario extends JpaRepository<usuario,Long> {
}
