package com.example.demo.services;

import com.example.demo.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario crearUsuario(Usuario id);

    Usuario modificarUsuario(String id);

    Usuario eliminarUsuario(String id);

    List<Usuario> listarUsuarios();
}
