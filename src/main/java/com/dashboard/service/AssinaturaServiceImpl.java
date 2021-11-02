package com.dashboard.service;

import com.dashboard.dto.AssinaturaDTO;
import com.dashboard.repository.AssinaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AssinaturaServiceImpl implements AbstractService<AssinaturaDTO> {

    @Autowired
    private AssinaturaRepository assinaturaRepository;

    public AssinaturaServiceImpl(AssinaturaRepository assinaturaRepository) {
        this.assinaturaRepository = assinaturaRepository;
    }

    @Override
    public Page<AssinaturaDTO> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public AssinaturaDTO findAssinaturaById(String id) {
        return null;
    }

    @Override
    public AssinaturaDTO saveAssinatura(AssinaturaDTO assinatura) {
        return null;
    }

    @Override
    public AssinaturaDTO updateAssinaturaById(String id, AssinaturaDTO assinatura) {
        return null;
    }

    @Override
    public void deleteAssinaturaById(String id) {
        assinaturaRepository.deleteById(id);
    }

    @Override
    public void checkIfAssinaturaIsNull(AssinaturaDTO assinatura) {

    }
}
