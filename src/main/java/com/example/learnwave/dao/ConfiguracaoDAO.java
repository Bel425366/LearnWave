package com.example.learnwave.dao;

import com.example.learnwave.model.entity.Configuracao;

import java.util.List;

public interface ConfiguracaoDAO {

    Configuracao salvar(Configuracao configuracao);
    List<Configuracao> listarTodas();
    Configuracao buscarPorChave(String chave);
    Configuracao atualizar(Configuracao configuracao);
    boolean excluir(String chave);
}