package com.trabalho.notificar.model;

import java.io.Serializable;

public class PaymentRequest implements Serializable {
    
    private String descricao;
    private double valor;

    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}