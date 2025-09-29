package com.example.learnwave.dao;

import com.example.learnwave.model.entity.DownloadMaterial;

import java.util.List;

public interface DownloadMaterialDAO {

    DownloadMaterial salvar(DownloadMaterial download);
    List<DownloadMaterial> listarPorAluno(Integer alunoId);
    List<DownloadMaterial> listarPorMaterial(Integer materialId);
    Long contarDownloads(Integer materialId);
}