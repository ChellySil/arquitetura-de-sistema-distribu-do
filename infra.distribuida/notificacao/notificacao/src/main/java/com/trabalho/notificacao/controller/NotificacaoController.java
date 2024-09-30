package com.trabalho.notificacao.controller;

import com.exemplo.notificacao.model.Usuario;
import com.exemplo.notificacao.service.NotificacaoService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.trabalho.notificacao.model.PaymentRequest;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notificar")
public class NotificacaoController {

    private final RabbitTemplate rabbitTemplate;

    public NotificationController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping
    public ResponseEntity<String> notificar(@RequestBody PaymentRequest paymentRequest) {
        rabbitTemplate.convertAndSend("notificacoes", paymentRequest);
        return new ResponseEntity<>("Notificação Enviada", HttpStatus.OK);
    }
}
