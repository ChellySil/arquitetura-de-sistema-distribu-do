package com.trabalho.notificacao.controller;

import com.exemplo.notificacao.model.Usuario;
import com.exemplo.notificacao.service.NotificacaoService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notificar")
public class NotificacaoController {

    @Autowired
    private NotificacaoService notificacaoService;

    @RabbitListener(queues = "notificacao.queue")
    public void notificar(Usuario usuario) {
        notificacaoService.processarNotificacao(usuario);
    }
}