/*
*
* Aula com Nataniel Paiva
*
* Esse projeto poderá ser distribuído da forma que você achar melhor
* O importante é que você aprenda de verdade!
*
 */
package com.springmongo.springmongo.controller;

import com.springmongo.springmongo.entity.Usuario;
import com.springmongo.springmongo.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listar() {
        return this.usuarioService.listaUsuario();
    }

    @GetMapping("/{id}")
    public Usuario getById(@PathVariable String id) {
        return this.usuarioService.getById(id);
    }

    @GetMapping("/{page}/{count}")
    public Page<Usuario> listaPaginada(@PathVariable int page, @PathVariable int count) {
        return this.usuarioService.listaPaginada(count, page);
    }

    @GetMapping("{nome}/nome")
    public List<Usuario> listaPaginada(@PathVariable String nome) {
        return this.usuarioService.buscaPorNome(nome);
    }

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario) {
        return this.usuarioService.salvarUsuario(usuario);
    }

    @PutMapping
    public Usuario editar(@RequestBody Usuario usuario) {
        return this.usuarioService.atualizar(usuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        this.usuarioService.deleteUsuario(id);
    }

}
