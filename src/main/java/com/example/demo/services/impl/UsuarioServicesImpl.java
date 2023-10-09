package com.example.demo.services.impl;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioServicesImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario crearUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario modificarUsuario(String cedula, Usuario usuario) {
        Usuario user = usuarioRepository.findUsuarioByCedula(cedula);
        usuario.setId(user.getId());
        return usuarioRepository.save(usuario);
    }

   public void eliminarUsuario(String cedula){
        Usuario user = usuarioRepository.findUsuarioByCedula(cedula);
        usuarioRepository.delete(user);
   }

   public Usuario buscarUsuario(String cedula){
        return usuarioRepository.findUsuarioByCedula(cedula);
   }

}
