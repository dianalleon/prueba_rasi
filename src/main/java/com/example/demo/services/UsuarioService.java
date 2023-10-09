package com.example.demo.services;

import com.example.demo.entity.Usuario;

public interface UsuarioService {

    Usuario crearUsuario(Usuario id);

    Usuario modificarUsuario(String cedula,Usuario usuario);

    void eliminarUsuario(String cedula);

    Usuario buscarUsuario(String cedula);

}
