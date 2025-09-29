package com.example.learnwave.service;

import com.example.learnwave.dao.ConfiguracaoDAO;
import com.example.learnwave.model.entity.Configuracao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfiguracaoService {

    @Autowired
    private ConfiguracaoDAO configuracaoDAO;

    public Configuracao salvar(Configuracao configuracao) {
        return configuracaoDAO.salvar(configuracao);
    }

    public List<Configuracao> listarTodas() {
        return configuracaoDAO.listarTodas();
    }

    public Configuracao buscarPorChave(String chave) {
        return configuracaoDAO.buscarPorChave(chave);
    }

    public Configuracao atualizar(Configuracao configuracao) {
        return configuracaoDAO.atualizar(configuracao);
    }

    public boolean excluir(String chave) {
        return configuracaoDAO.excluir(chave);
    }
}