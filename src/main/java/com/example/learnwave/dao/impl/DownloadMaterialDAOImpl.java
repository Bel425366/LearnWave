package com.example.learnwave.dao.impl;

import com.example.learnwave.dao.DownloadMaterialDAO;
import com.example.learnwave.model.entity.DownloadMaterial;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DownloadMaterialDAOImpl implements DownloadMaterialDAO {

    @Override
    public DownloadMaterial salvar(DownloadMaterial download) {
        return download;
    }

    @Override
    public List<DownloadMaterial> listarPorAluno(Integer alunoId) {
        return new ArrayList<>();
    }

    @Override
    public List<DownloadMaterial> listarPorMaterial(Integer materialId) {
        return new ArrayList<>();
    }

    @Override
    public Long contarDownloads(Integer materialId) {
        return 0L;
    }
}