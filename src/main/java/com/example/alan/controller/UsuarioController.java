package com.example.alan.controller;

import com.example.alan.entity.Usuario;
import com.example.alan.repository.RoleRepo;
import com.example.alan.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController{

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    RoleRepo rolesRepo;


    @GetMapping("/")
    public String index(){

        return "index";
    }

    @GetMapping("/userList")
    public String getUsuarioList(Model model){
        model.addAttribute("user_list", usuarioService.getAllUsuarios());
        model.addAttribute("roles", rolesRepo.findAll());
        return "user_list";
    }

    @GetMapping("/userForm")
    public String getUsuarioForm(Model model){
        model.addAttribute("userForm", new Usuario());
        model.addAttribute("roles", rolesRepo.findAll());
        return "user_form";
    }

    
}