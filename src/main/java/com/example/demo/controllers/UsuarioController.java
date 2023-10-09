package com.example.demo.controllers;

import com.example.demo.entity.Usuario;
import com.example.demo.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping("/crearUsuario")
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return usuarioService.crearUsuario(usuario);
    }

    @PutMapping("editarUsuario/{cedula}")
    public Usuario editarUsuario(@PathVariable String cedula, @RequestBody Usuario usuario){
        return usuarioService.modificarUsuario(cedula, usuario);
    }

    @DeleteMapping("eliminarUsuario/{cedula}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarUsuario(@PathVariable String cedula) {
       usuarioService.eliminarUsuario(cedula);
    }

    @GetMapping("buscarUsuario/{cedula}")
    public Usuario buscarUsuario(@PathVariable String cedula){
       return usuarioService.buscarUsuario(cedula);
    }
}