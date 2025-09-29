package com.example.learnwave.dao;

import com.example.learnwave.model.entity.ProgressoVideoaula;

import java.util.List;

public interface ProgressoVideoaulaDAO {

    ProgressoVideoaula salvar(ProgressoVideoaula progresso);
    List<ProgressoVideoaula> listarPorAluno(Integer alunoId);
    List<ProgressoVideoaula> listarPorVideoaula(Integer videoaulaId);
    ProgressoVideoaula atualizar(ProgressoVideoaula progresso);
    void atualizarTempo(Integer id, Integer tempoAssistido);
    void concluirVideoaula(Integer id);
}