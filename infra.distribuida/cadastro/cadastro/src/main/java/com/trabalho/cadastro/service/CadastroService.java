package com.trabalho.cadastro.service;

import com.trabalho.cadastro.model.Usuario;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void cadastrarUsuario(Usuario usuario) {
        System.out.println("Usuário cadastrado: " + usuario.getNome());
        rabbitTemplate.convertAndSend("notificacao.queue", usuario);
    }
}
