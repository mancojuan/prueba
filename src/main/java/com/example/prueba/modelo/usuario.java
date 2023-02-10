package com.example.prueba.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor

public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long polizaid;
    @Column(nullable = false)
    private String nombre;
    private Long idcliente;
    private Date fechan;
    private Date fechap;
    @Column(nullable = false)

    private String direccion;
    @Column(nullable = false)

    private String ciudad;

}
