package com.example.learnwave.dao.impl;

import com.example.learnwave.dao.ProgressoVideoaulaDAO;
import com.example.learnwave.model.entity.ProgressoVideoaula;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProgressoVideoaulaDAOImpl implements ProgressoVideoaulaDAO {

    @Override
    public ProgressoVideoaula salvar(ProgressoVideoaula progresso) {
        return progresso;
    }

    @Override
    public List<ProgressoVideoaula> listarPorAluno(Integer alunoId) {
        return new ArrayList<>();
    }

    @Override
    public List<ProgressoVideoaula> listarPorVideoaula(Integer videoaulaId) {
        return new ArrayList<>();
    }

    @Override
    public ProgressoVideoaula atualizar(ProgressoVideoaula progresso) {
        return progresso;
    }

    @Override
    public void atualizarTempo(Integer id, Integer tempoAssistido) {
        // TODO: Implementar atualização de tempo
    }

    @Override
    public void concluirVideoaula(Integer id) {
        // TODO: Implementar conclusão da videoaula
    }
}