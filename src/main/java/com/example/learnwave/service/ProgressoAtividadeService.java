package com.example.learnwave.service;

import com.example.learnwave.dao.ProgressoAtividadeDAO;
import com.example.learnwave.model.entity.ProgressoAtividade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressoAtividadeService {

    @Autowired
    private ProgressoAtividadeDAO progressoAtividadeDAO;

    public ProgressoAtividade iniciarAtividade(ProgressoAtividade progresso) {
        return progressoAtividadeDAO.salvar(progresso);
    }

    public List<ProgressoAtividade> listarPorAluno(Integer alunoId) {
        return progressoAtividadeDAO.listarPorAluno(alunoId);
    }

    public List<ProgressoAtividade> listarPorAtividade(Integer atividadeId) {
        return progressoAtividadeDAO.listarPorAtividade(atividadeId);
    }

    public ProgressoAtividade atualizarProgresso(ProgressoAtividade progresso) {
        return progressoAtividadeDAO.atualizar(progresso);
    }

    public void concluirAtividade(Integer id, Double nota) {
        progressoAtividadeDAO.concluirAtividade(id, nota);
    }
}