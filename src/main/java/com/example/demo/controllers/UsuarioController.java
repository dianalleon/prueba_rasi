package com.example.demo.controllers;

import com.example.demo.entity.Usuario;
import com.example.demo.services.UsuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping("/crearUsuario")
    public Usuario crearUsuario(@RequestBody @Valid Usuario usuario){
        return usuarioService.crearUsuario(usuario);
    }



    @GetMapping("/listarUsuarios")
    public List<Usuario> listarUsuarios(){
        return usuarioService.listarUsuarios();
    }

}
