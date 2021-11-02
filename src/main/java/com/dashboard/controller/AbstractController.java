package com.dashboard.controller;

import com.dashboard.dto.AssinaturaDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public interface AbstractController {

    @GetMapping("/all")
    @ApiOperation(value = "Mostra as assinaturas de forma paginada")
    ResponseEntity<?> findAllAssinaturas(@PageableDefault(direction = Sort.Direction.ASC) Pageable pageable);

    @GetMapping("/find/{id}")
    @ApiOperation(value = "Mostra uma assinatura em específico")
    ResponseEntity<?> findAssinaturaById(@PathVariable("id") String id);

    @PostMapping("/add")
    @ApiOperation(value = "Cria uma nova assinatura")
    ResponseEntity<?> saveAssinatura(@RequestBody @Valid AssinaturaDTO dto);

    @PutMapping("/update/{id}")
    @ApiOperation(value = "Atualiza uma assinatura em específico")
    ResponseEntity<?> updateAssinatura(@PathVariable("id") String id,@RequestBody AssinaturaDTO dto);

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "Deleta uma assinatura em específico")
    ResponseEntity<?> deleteAssinatura(@PathVariable("id") String id);
}
