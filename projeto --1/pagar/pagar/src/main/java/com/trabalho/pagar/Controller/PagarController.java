package com.trabalho.pagar.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.trabalho.pagar.model.PaymentRequest;


@RestController
public class PagarController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/pagar")
    public ResponseEntity<String> pagar(@RequestBody PaymentRequest paymentRequest) {
        System.out.println("Processando pagamento: " + paymentRequest);

        String microservice2Url = "http://localhost:8083/notificar"; 

        ResponseEntity<String> response = restTemplate.postForEntity(microservice2Url, paymentRequest, String.class);

        return ResponseEntity.ok("Pagamento processado. Notificação enviada para o Microserviço 2.");
    }
}
