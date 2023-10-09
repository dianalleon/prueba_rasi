package com.example.demo.services.impl;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServicesImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario crearUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario modificarUsuario(String id) {
        return usuarioRepository.findUsuarioByCedula(id);
    }

    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }
}
