/*
*
* Aula com Nataniel Paiva
*
* Esse projeto poderá ser distribuído da forma que você achar melhor
* O importante é que você aprenda de verdade!
*
 */
package com.springmongo.springmongo.repository;

import java.util.List;

import com.springmongo.springmongo.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    List<Usuario> findByNomeLikeIgnoreCase(String nome);

    Usuario findByEmail(String email);

    Usuario save(Usuario usuario);

}
