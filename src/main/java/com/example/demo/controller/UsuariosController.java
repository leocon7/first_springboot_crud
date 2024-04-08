package com.example.demo.controller;

import com.example.demo.entity.UsuariosEntity;
import com.example.demo.service.UsuariosService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/q4")
@AllArgsConstructor
public class UsuariosController {
    private final UsuariosService usuariosService;
    @PostMapping
    public ResponseEntity<UsuariosEntity> crear(@RequestBody UsuariosEntity entity){
        UsuariosEntity usuariosEntity = usuariosService.crearUsuario(entity);
        return ResponseEntity.ok(usuariosEntity);
    }
}
