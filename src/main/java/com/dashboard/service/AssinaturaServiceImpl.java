package com.dashboard.service;

import com.dashboard.dto.AssinaturaDTO;
import com.dashboard.exceptions.AssinaturaNotFoundException;
import com.dashboard.mapper.AssinaturaMapper;
import com.dashboard.repository.AssinaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
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
        return assinaturaRepository.findAll(pageable).map(AssinaturaMapper::mapToDTO);
    }

    @Override
    public AssinaturaDTO findAssinaturaById(String id) {
        return assinaturaRepository.findById(id).map(AssinaturaMapper::mapToDTO)
                .orElseThrow(
                        () -> new AssinaturaNotFoundException("Nenhuma assinatura foi encontrada com o id: "+id)
                );
    }

    @Override
    public AssinaturaDTO saveAssinatura(AssinaturaDTO assinatura) {
        checkIfAssinaturaIsNull(assinatura);
        assinaturaRepository.save(AssinaturaMapper.mapToModel(assinatura));
        return assinatura;
    }

    @Override
    public AssinaturaDTO updateAssinaturaById(String id, AssinaturaDTO assinatura) {
        assinaturaRepository.findById(id)
                .map(assinatura1 -> AssinaturaMapper.mapToModel(assinatura));
        checkIfAssinaturaIsNull(assinatura);
        return assinatura;

    }

    @Override
    public void deleteAssinaturaById(String id) {
        assinaturaRepository.deleteById(id);
    }

    @Override
    public void checkIfAssinaturaIsNull(AssinaturaDTO assinatura) {
        if (assinatura.equals(null)){
            throw new NullPointerException("A assinatura está nula");
        }
    }
}
