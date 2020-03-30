package com.example.alan.service;

import com.example.alan.entity.Usuario;
import com.example.alan.repository.UsuarioRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    UsuarioRepo usuarioRepo;

    @Override
    public Iterable<Usuario> getAllUsuarios(){


        return usuarioRepo.findAll();
    }
}