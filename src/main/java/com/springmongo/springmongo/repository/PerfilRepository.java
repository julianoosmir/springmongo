/*
*
* Aula com Nataniel Paiva
*
* Esse projeto poderá ser distribuído da forma que você achar melhor
* O importante é que você aprenda de verdade!
*
 */
package com.springmongo.springmongo.repository;

import com.springmongo.springmongo.entity.Perfil;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
public interface PerfilRepository extends MongoRepository<Perfil, String> {
    Perfil findByNome(String nome);

}
