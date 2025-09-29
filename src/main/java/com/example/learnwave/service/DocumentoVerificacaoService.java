package com.example.learnwave.service;

import com.example.learnwave.dao.DocumentoVerificacaoDAO;
import com.example.learnwave.model.entity.DocumentoVerificacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoVerificacaoService {

    @Autowired
    private DocumentoVerificacaoDAO documentoVerificacaoDAO;

    public DocumentoVerificacao salvarDocumento(DocumentoVerificacao documento) {
        return documentoVerificacaoDAO.salvar(documento);
    }

    public List<DocumentoVerificacao> listarPorUsuario(Integer usuarioId) {
        return documentoVerificacaoDAO.listarPorUsuario(usuarioId);
    }

    public DocumentoVerificacao buscarPorId(Integer id) {
        return documentoVerificacaoDAO.buscarPorId(id);
    }

    public boolean excluir(Integer id) {
        return documentoVerificacaoDAO.excluir(id);
    }
}