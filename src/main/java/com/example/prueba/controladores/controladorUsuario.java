package com.example.prueba.controladores;

import com.example.prueba.modelo.usuario;
import com.example.prueba.servicios.servicioUsuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class controladorUsuario {

    private final servicioUsuario servicioUsuario;

    @PostMapping
    public ResponseEntity guardarUsuario(@RequestBody usuario usuario){
        return new ResponseEntity(servicioUsuario.guardarUsuario(usuario), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")

    public ResponseEntity obtenerUsuario(@PathVariable("id") Long idUsuario){
        return new ResponseEntity(servicioUsuario.obtenerUsuario(idUsuario), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity modificarUsuario(@PathVariable("id") Long idUsuario,@RequestBody usuario usuario){
        return new ResponseEntity(servicioUsuario.usuarioAModificar(idUsuario,usuario), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarUsuario(@PathVariable("id") Long idUsuario){
        boolean respuesta = servicioUsuario.eliminarUsuario(idUsuario);
       if (respuesta== true){
           return new ResponseEntity(HttpStatus.OK);
       }
       else {
           return new ResponseEntity(HttpStatus.NOT_FOUND);
       }
    }

}

