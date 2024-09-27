package com.trabalho.notificacao.service;

import com.exemplo.notificacao.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {

    public void processarNotificacao(Usuario usuario) {
        System.out.println("Notificação de cadastro recebida para: " + usuario.getNome() + " com e-mail: " + usuario.getEmail());
    }
}
