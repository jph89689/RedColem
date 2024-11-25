package com.RedColem.RedColem.com.redcolem.app.usuario.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String apellido;

    @Column(nullable = false, unique = true, length = 100)
    private String correoElectronico;

    @Column(length = 20)
    private String telefono;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(length = 100)
    private String direccion;

    @Column(length = 255)
    private String fotoPerfil;

    @Column(columnDefinition = "TEXT")
    private String biografia;

    @Column(length = 255)
    private String sitioWeb;

    @Column(nullable = false)
    private Boolean activo;

    @Column
    private LocalDateTime ultimoAcceso;

    @Column
    private LocalDateTime fechaCreacion;

    @Column
    private LocalDateTime fechaModificacion;
}
