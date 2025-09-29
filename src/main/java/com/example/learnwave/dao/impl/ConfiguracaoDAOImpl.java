package com.example.learnwave.dao.impl;

import com.example.learnwave.dao.ConfiguracaoDAO;
import com.example.learnwave.model.entity.Configuracao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ConfiguracaoDAOImpl implements ConfiguracaoDAO {

    @Override
    public Configuracao salvar(Configuracao configuracao) {
        return configuracao;
    }

    @Override
    public List<Configuracao> listarTodas() {
        return new ArrayList<>();
    }

    @Override
    public Configuracao buscarPorChave(String chave) {
        return null;
    }

    @Override
    public Configuracao atualizar(Configuracao configuracao) {
        return configuracao;
    }

    @Override
    public boolean excluir(String chave) {
        return true;
    }
}