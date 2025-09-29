package com.example.learnwave.dao;


import com.example.learnwave.enums.StatusConteudo;
import com.example.learnwave.model.entity.Videoaula;

import java.util.List;

public interface VideoaulaDAO {

    // Operações CRUD básicas
    Videoaula salvar(Videoaula videoaula);
    Videoaula buscarPorId(Integer id);
    List<Videoaula> listarTodas();
    Videoaula atualizar(Videoaula videoaula);
    boolean deletar(Integer id);

    // Consultas específicas
    List<Videoaula> buscarPorProfessor(Integer professorId);
    List<Videoaula> buscarPorArea(String area);
    List<Videoaula> buscarPorStatus(StatusConteudo status);
    List<Videoaula> buscarPorStatus(String status);
    List<Videoaula> buscarPublicadas();
    List<Videoaula> buscarPorDuracao(String duracao);
    List<Videoaula> buscarPorAreaEStatus(String area, StatusConteudo status);

    // Operações de status
    boolean publicar(Integer id);
    boolean arquivar(Integer id);
    boolean voltarParaRascunho(Integer id);

    // Estatísticas
    long contarPorProfessor(Integer professorId);
    long contarPorArea(String area);
    long contarPorStatus(StatusConteudo status);
}