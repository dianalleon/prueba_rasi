package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario", schema = "public")
public class Usuario {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cedula")
    @NotNull
    private String cedula;

    @Column(name = "nombre")
    @NotNull
    private String name;

    @Column(name = "apellido")
    @NotNull
    private String apellido;

    @Column(name = "correo")
    @NotNull
    private String correo;

    @Column(name = "contrasena")
    @NotNull
    private String contrasena;
}