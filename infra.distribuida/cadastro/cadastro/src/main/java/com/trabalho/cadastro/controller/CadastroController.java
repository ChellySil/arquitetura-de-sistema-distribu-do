package com.trabalho.cadastro.controller;

import com.trabalho.cadastro.model.Usuario;
import com.trabalho.cadastro.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.trabalho.cadastro.model.PaymentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/pagar")
public class CadastroController {

   @Autowired
    private RestTemplate restTemplate; 

    @PostMapping("/pagar")
    public ResponseEntity<String> pagar(@RequestBody PaymentRequest paymentRequest) {
        System.out.println("Processando pagamento: " + paymentRequest);

        String microservice2Url = "http://microservice2:8081/notificar"; 
        ResponseEntity<String> response = restTemplate.postForEntity(microservice2Url, paymentRequest, String.class);

        return ResponseEntity.ok("Pagamento processado. Notificação enviada para o microserviço 2.");
    }
}
