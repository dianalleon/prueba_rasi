package com.example.demo.services;

import com.example.demo.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario crearUsuario(Usuario id);

    Usuario modificarUsuario(String cedula,Usuario usuario);

    void eliminarUsuario(Usuario usuario);

}
