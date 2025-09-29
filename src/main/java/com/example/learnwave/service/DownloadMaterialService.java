package com.example.learnwave.service;

import com.example.learnwave.dao.DownloadMaterialDAO;
import com.example.learnwave.model.entity.DownloadMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DownloadMaterialService {

    @Autowired
    private DownloadMaterialDAO downloadMaterialDAO;

    public DownloadMaterial registrarDownload(DownloadMaterial download) {
        return downloadMaterialDAO.salvar(download);
    }

    public List<DownloadMaterial> listarPorAluno(Integer alunoId) {
        return downloadMaterialDAO.listarPorAluno(alunoId);
    }

    public List<DownloadMaterial> listarPorMaterial(Integer materialId) {
        return downloadMaterialDAO.listarPorMaterial(materialId);
    }

    public Long contarDownloads(Integer materialId) {
        return downloadMaterialDAO.contarDownloads(materialId);
    }
}