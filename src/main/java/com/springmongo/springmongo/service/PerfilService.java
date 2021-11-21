package com.springmongo.springmongo.service;
import java.util.List;

import com.springmongo.springmongo.entity.Perfil;
import com.springmongo.springmongo.repository.PerfilRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class PerfilService {

    @Autowired
    PerfilRepository perfilRepository;

    public List<Perfil> listaPerfil() {
        return perfilRepository.findAll();
    }


    public Perfil salvarPerfil(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

    public void deletePerfil(String id) {
        perfilRepository.deleteById(id);
    }

    public Perfil getById(String id) {
        return perfilRepository.findById(id).get();
    }

}