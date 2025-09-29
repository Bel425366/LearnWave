package com.example.learnwave.service;

import com.example.learnwave.dao.ProgressoVideoaulaDAO;
import com.example.learnwave.model.entity.ProgressoVideoaula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressoVideoaulaService {

    @Autowired
    private ProgressoVideoaulaDAO progressoVideoaulaDAO;

    public ProgressoVideoaula iniciarVideoaula(ProgressoVideoaula progresso) {
        return progressoVideoaulaDAO.salvar(progresso);
    }

    public List<ProgressoVideoaula> listarPorAluno(Integer alunoId) {
        return progressoVideoaulaDAO.listarPorAluno(alunoId);
    }

    public List<ProgressoVideoaula> listarPorVideoaula(Integer videoaulaId) {
        return progressoVideoaulaDAO.listarPorVideoaula(videoaulaId);
    }

    public ProgressoVideoaula atualizarProgresso(ProgressoVideoaula progresso) {
        return progressoVideoaulaDAO.atualizar(progresso);
    }

    public void atualizarTempo(Integer id, Integer tempoAssistido) {
        progressoVideoaulaDAO.atualizarTempo(id, tempoAssistido);
    }

    public void concluirVideoaula(Integer id) {
        progressoVideoaulaDAO.concluirVideoaula(id);
    }
}