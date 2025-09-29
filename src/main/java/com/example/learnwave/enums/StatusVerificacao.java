package com.example.learnwave.enums;

public enum StatusVerificacao {
    PENDENTE("pendente"),
    APROVADO("aprovado"),
    REJEITADO("rejeitado");

    private final String valor;

    StatusVerificacao(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public static StatusVerificacao fromString(String valor) {
        for (StatusVerificacao status : StatusVerificacao.values()) {
            if (status.valor.equalsIgnoreCase(valor)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Status de verificação inválido: " + valor);
    }
}