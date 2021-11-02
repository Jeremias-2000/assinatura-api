package com.dashboard.mapper;


import com.dashboard.document.Assinatura;
import com.dashboard.dto.AssinaturaDTO;

public class AssinaturaMapper {

    public static Assinatura mapToModel(AssinaturaDTO dto){
        return Assinatura.builder()
                .id(dto.getId())
                .nome(dto.getNome())
                .numero(dto.getNumero())
                .email(dto.getEmail())
                .senha(dto.getSenha())
                .plano(dto.getPlano())
                .fatura(dto.getFatura())
                .dataVencimento(dto.getDataVencimento())
                .createdAt(dto.getCreatedAt())
                .status(dto.getStatus())
                .build();
    }

    public static AssinaturaDTO mapToDTO(Assinatura assinatura){
        return AssinaturaDTO.builder()
                .id(assinatura.getId())
                .nome(assinatura.getNome())
                .numero(assinatura.getNumero())
                .email(assinatura.getEmail())
                .senha(assinatura.getSenha())
                .plano(assinatura.getPlano())
                .fatura(assinatura.getFatura())
                .dataVencimento(assinatura.getDataVencimento())
                .createdAt(assinatura.getCreatedAt())
                .status(assinatura.getStatus())
                .build();
    }

}
