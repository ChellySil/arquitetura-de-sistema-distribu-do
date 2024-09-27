package com.trabalho.cadastro.controller;

import com.trabalho.cadastro.model.Usuario;
import com.trabalho.cadastro.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastrar")
public class CadastroController {

    @Autowired
    private CadastroService cadastroService;

    @PostMapping
    public ResponseEntity<String> cadastrar(@RequestBody Usuario usuario) {
        cadastroService.cadastrarUsuario(usuario);
        return ResponseEntity.ok("Usuário cadastrado com sucesso");
    }
}
