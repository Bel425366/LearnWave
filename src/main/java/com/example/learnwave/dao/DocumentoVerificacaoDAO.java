package com.example.learnwave.dao;

import com.example.learnwave.model.entity.DocumentoVerificacao;

import java.util.List;

public interface DocumentoVerificacaoDAO {

    DocumentoVerificacao salvar(DocumentoVerificacao documento);
    List<DocumentoVerificacao> listarPorUsuario(Integer usuarioId);
    DocumentoVerificacao buscarPorId(Integer id);
    boolean excluir(Integer id);
}