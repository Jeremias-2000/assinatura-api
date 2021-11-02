package com.dashboard.controller;

import com.dashboard.dto.AssinaturaDTO;
import com.dashboard.service.AssinaturaServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Assinatura-Controller")
@RequestMapping("/api/v1/assinaturas")
public class AssinaturaController implements AbstractController {

    @Autowired
    private AssinaturaServiceImpl serviceImpl;

    @Override
    public ResponseEntity<?> findAllAssinaturas(Pageable pageable) {
        return ResponseEntity.ok(serviceImpl.findAll(pageable));
    }

    @Override
    public ResponseEntity<?> findAssinaturaById(String id) {
        return ResponseEntity.ok(serviceImpl.findAssinaturaById(id));
    }

    @Override
    public ResponseEntity<?> saveAssinatura(AssinaturaDTO dto) {
        return new ResponseEntity<>(serviceImpl.saveAssinatura(dto), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> updateAssinatura(String id, AssinaturaDTO dto) {
        return ResponseEntity.ok(serviceImpl.updateAssinaturaById(id, dto));
    }

    @Override
    public ResponseEntity<?> deleteAssinatura(String id) {
        serviceImpl.deleteAssinaturaById(id);
        return ResponseEntity.ok().build();
    }
}
