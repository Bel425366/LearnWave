package com.example.learnwave.dao.impl;

import com.example.learnwave.dao.UsuarioDAO;
import com.example.learnwave.enums.StatusVerificacao;
import com.example.learnwave.enums.TipoUsuario;
import com.example.learnwave.model.entity.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

    @Override
    public Usuario salvar(Usuario usuario) {
        return usuario;
    }

    @Override
    public Usuario buscarPorId(Integer id) {
        return null;
    }

    @Override
    public Usuario buscarPorEmail(String email) {
        return null;
    }

    @Override
    public List<Usuario> listarTodos() {
        return new ArrayList<>();
    }

    @Override
    public Usuario atualizar(Usuario usuario) {
        return usuario;
    }

    @Override
    public boolean deletar(Integer id) {
        return true;
    }

    @Override
    public List<Usuario> buscarPorTipo(TipoUsuario tipo) {
        return new ArrayList<>();
    }

    @Override
    public List<Usuario> buscarPorStatus(String status) {
        return new ArrayList<>();
    }

    @Override
    public List<Usuario> buscarPorStatusVerificacao(StatusVerificacao status) {
        return new ArrayList<>();
    }

    @Override
    public List<Usuario> buscarProfessoresPorArea(String area) {
        return new ArrayList<>();
    }

    @Override
    public boolean existeEmail(String email) {
        return false;
    }

    @Override
    public boolean existeCpf(String cpf) {
        return false;
    }

    @Override
    public boolean aprovarProfessor(Integer id) {
        return true;
    }

    @Override
    public boolean rejeitarProfessor(Integer id) {
        return true;
    }

    @Override
    public boolean ativarUsuario(Integer id) {
        return true;
    }

    @Override
    public boolean desativarUsuario(Integer id) {
        return true;
    }

    @Override
    public long contarUsuariosPorTipo(TipoUsuario tipo) {
        return 0;
    }

    @Override
    public long contarProfessoresPendentes() {
        return 0;
    }

    @Override
    public List<Usuario> buscarPorAreaEnsino(String area) {
        return new ArrayList<>();
    }

    @Override
    public List<Usuario> buscarPorDisciplina(String disciplina) {
        return new ArrayList<>();
    }

    @Override
    public List<Usuario> buscarPorEscola(String escola) {
        return new ArrayList<>();
    }

    @Override
    public List<Usuario> buscarPorStatusVerificacao(String status) {
        return new ArrayList<>();
    }
}