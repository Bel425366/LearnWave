package com.example.learnwave.enums;

public enum StatusProgresso {
    NAO_INICIADO("nao_iniciado"),
    EM_ANDAMENTO("em_andamento"),
    CONCLUIDO("concluido");

    private final String valor;

    StatusProgresso(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public static StatusProgresso fromString(String valor) {
        for (StatusProgresso status : StatusProgresso.values()) {
            if (status.valor.equalsIgnoreCase(valor)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Status de progresso inválido: " + valor);
    }
}