package com.dashboard.document;

import com.dashboard.enums.Plano;
import com.dashboard.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;


@Data
@Builder
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Assinatura {

    @Id
    private String id;
    private String nome;
    private String numero;
    private String email;
    private String senha;
    private Plano plano;
    private double fatura;
    private LocalDate dataVencimento;
    private Date createdAt;
    private Status status;


}
