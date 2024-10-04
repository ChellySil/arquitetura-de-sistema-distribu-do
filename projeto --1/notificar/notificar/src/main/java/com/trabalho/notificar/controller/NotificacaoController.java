package com.trabalho.notificar.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.trabalho.notificar.model.PaymentRequest;

@RestController
@RequestMapping("/notificar")
public class NotificacaoController {

    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public NotificacaoController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping
    public String notificar(@RequestBody PaymentRequest paymentRequest) {
    rabbitTemplate.convertAndSend("notificacoes", paymentRequest);

    
    System.out.println("Mensagem enviada para RabbitMQ: " + paymentRequest);
    return "Notificação de pagamento recebida e enviada para RabbitMQ.";
}


}