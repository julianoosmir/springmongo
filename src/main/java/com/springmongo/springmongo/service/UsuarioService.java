/*
*
* Aula com Nataniel Paiva
*
* Esse projeto poderá ser distribuído da forma que você achar melhor
* O importante é que você aprenda de verdade!
*
 */
package com.springmongo.springmongo.service;

import com.springmongo.springmongo.entity.Usuario;
import com.springmongo.springmongo.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> listaUsuario() {
        return usuarioRepository.findAll();
    }

    public Usuario salvarUsuario(Usuario usuarioAdd) {
        return usuarioRepository.save(usuarioAdd);
    }
    public Page<Usuario> listaPaginada(int count, int page) {
        Pageable pages = PageRequest.of(page, count);
        return usuarioRepository.findAll(pages);
    }

    public List<Usuario> buscaPorNome(String nome) {
        return usuarioRepository.findByNomeLikeIgnoreCase(nome);
    }

    public Usuario atualizar(Usuario pessoa) {
        Optional<Usuario> pessoaBD = usuarioRepository.findById(pessoa.getId());
        pessoaBD.ifPresent(p -> pessoa.setId(p.getId()));
        return usuarioRepository.save(pessoa);
    }
    public void deleteUsuario(String id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario getById(String id) {
        return usuarioRepository.findById(id).get();
    }

}
