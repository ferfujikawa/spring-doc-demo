package com.fujikawa.springdocdemo.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fujikawa.springdocdemo.dtos.UsuarioDTO;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("usuarios")
@SecurityRequirement(name = "bearer-key")
public class UsuarioController {

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<UsuarioDTO>> listarUsuarios() {

        List<UsuarioDTO> usuarios = Arrays.asList(
            new UsuarioDTO(UUID.randomUUID(), "Usuário 1", "usuario1@email.com"),
            new UsuarioDTO(UUID.randomUUID(), "Usuário 2", "usuario2@email.com"),
            new UsuarioDTO(UUID.randomUUID(), "Usuário 2", "usuario2@email.com")
        );

        return ResponseEntity.ok(usuarios);
    }
}
