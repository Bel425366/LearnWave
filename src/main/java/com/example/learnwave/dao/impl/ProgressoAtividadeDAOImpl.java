package com.example.learnwave.dao.impl;

import com.example.learnwave.dao.ProgressoAtividadeDAO;
import com.example.learnwave.model.entity.ProgressoAtividade;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProgressoAtividadeDAOImpl implements ProgressoAtividadeDAO {

    @Override
    public ProgressoAtividade salvar(ProgressoAtividade progresso) {
        return progresso;
    }

    @Override
    public List<ProgressoAtividade> listarPorAluno(Integer alunoId) {
        return new ArrayList<>();
    }

    @Override
    public List<ProgressoAtividade> listarPorAtividade(Integer atividadeId) {
        return new ArrayList<>();
    }

    @Override
    public ProgressoAtividade atualizar(ProgressoAtividade progresso) {
        return progresso;
    }

    @Override
    public void concluirAtividade(Integer id, Double nota) {
        // TODO: Implementar conclusão da atividade
    }
}