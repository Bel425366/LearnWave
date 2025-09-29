package com.example.learnwave.dao.impl;

import com.example.learnwave.dao.VideoaulaDAO;
import com.example.learnwave.enums.StatusConteudo;
import com.example.learnwave.model.entity.Videoaula;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VideoaulaDAOImpl implements VideoaulaDAO {

    @Override
    public Videoaula salvar(Videoaula videoaula) {
        return videoaula;
    }

    @Override
    public Videoaula buscarPorId(Integer id) {
        return null;
    }

    @Override
    public List<Videoaula> listarTodas() {
        return new ArrayList<>();
    }

    @Override
    public Videoaula atualizar(Videoaula videoaula) {
        return videoaula;
    }

    @Override
    public boolean deletar(Integer id) {
        return true;
    }

    @Override
    public List<Videoaula> buscarPorProfessor(Integer professorId) {
        return new ArrayList<>();
    }

    @Override
    public List<Videoaula> buscarPorAreaEStatus(String area, StatusConteudo status) {
        return new ArrayList<>();
    }

    @Override
    public boolean publicar(Integer id) {
        return true;
    }

    @Override
    public boolean arquivar(Integer id) {
        return true;
    }

    @Override
    public long contarPorStatus(StatusConteudo status) {
        return 0;
    }

    @Override
    public long contarPorArea(String area) {
        return 0;
    }

    @Override
    public long contarPorProfessor(Integer professorId) {
        return 0;
    }

    @Override
    public boolean voltarParaRascunho(Integer id) {
        return true;
    }

    @Override
    public List<Videoaula> buscarPublicadas() {
        return new ArrayList<>();
    }

    @Override
    public List<Videoaula> buscarPorStatus(String status) {
        return new ArrayList<>();
    }

    @Override
    public List<Videoaula> buscarPorDuracao(String duracao) {
        return new ArrayList<>();
    }

    @Override
    public List<Videoaula> buscarPorArea(String area) {
        return new ArrayList<>();
    }

    @Override
    public List<Videoaula> buscarPorStatus(StatusConteudo status) {
        return new ArrayList<>();
    }
}