package com.trabalho.cadastro.controller;

import com.trabalho.cadastro.model.Usuario;
import com.trabalho.cadastro.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/pagar")
public class CadastroController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping
    public ResponseEntity<String> pagar(@RequestBody PaymentRequest paymentRequest) {
        ResponseEntity<String> response = restTemplate.postForEntity(
                "http://microservice2:5001/notificar", paymentRequest, String.class);
        return new ResponseEntity<>("Pagamento Processado: " + response.getBody(), HttpStatus.OK);
    }
}
