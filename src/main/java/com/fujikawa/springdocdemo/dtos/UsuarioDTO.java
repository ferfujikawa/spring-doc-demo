package com.fujikawa.springdocdemo.dtos;

import java.util.UUID;

public class UsuarioDTO {

    private UUID id;

    private String nomeUsuario;

    private String email;

    public UsuarioDTO(UUID id, String nomeUsuario, String email) {
        this.id = id;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
