package com.springmongo.springmongo.controller;

import java.util.List;

import com.springmongo.springmongo.entity.Perfil;
import com.springmongo.springmongo.service.PerfilService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PerfilController {
    @Autowired
    PerfilService perfilService;

    @GetMapping
    public List<Perfil> listar() {
        return this.perfilService.listaPerfil();
    }

    @GetMapping("/{id}")
    public Perfil getById(@PathVariable String id) {
        return this.perfilService.getById(id);
    }

 

    

    @PostMapping
    public Perfil salvar(@RequestBody Perfil Perfil) {
        return this.perfilService.salvarPerfil(Perfil);
    }

    // @PutMapping
    // public Perfil editar(@RequestBody Perfil Perfil) {
    //     return this.perfilService.atualizar(Perfil);
    // }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        this.perfilService.deletePerfil(id);
    }
}
