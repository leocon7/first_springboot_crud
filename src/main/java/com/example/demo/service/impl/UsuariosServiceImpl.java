package com.example.demo.service.impl;

import com.example.demo.entity.UsuariosEntity;
import com.example.demo.repository.UsuariosRepository;
import com.example.demo.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServiceImpl implements UsuariosService {
    //@Autowired
    //private UsuariosRepository usuariosRepository;
    private final UsuariosRepository usuariosRepository;
    public UsuariosServiceImpl(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }
    @Override
    public UsuariosEntity crearUsuario(UsuariosEntity usuariosEntity) {
        return usuariosRepository.save(usuariosEntity);
    }
    //findAll
    //findById
}
