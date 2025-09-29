package com.example.learnwave.dao.impl;

import com.example.learnwave.dao.DocumentoVerificacaoDAO;
import com.example.learnwave.model.entity.DocumentoVerificacao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DocumentoVerificacaoDAOImpl implements DocumentoVerificacaoDAO {

    @Override
    public DocumentoVerificacao salvar(DocumentoVerificacao documento) {
        return documento;
    }

    @Override
    public List<DocumentoVerificacao> listarPorUsuario(Integer usuarioId) {
        return new ArrayList<>();
    }

    @Override
    public DocumentoVerificacao buscarPorId(Integer id) {
        return null;
    }

    @Override
    public boolean excluir(Integer id) {
        return true;
    }
}