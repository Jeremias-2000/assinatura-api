package com.dashboard.dto;

import com.dashboard.enums.Plano;
import com.dashboard.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssinaturaDTO {

    private String id;
    @NotBlank
    private String nome;
    @NotBlank
    //@Pattern(regexp = "(\\d{2}) \\d{4}-\\d{4}",message = "padrao (xx) xxxx-xxxx")
    private String numero;
    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String senha;
    @NotNull
    private Plano plano;
    @NotNull
    private double fatura;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "Brazil/East")
    private LocalDate dataVencimento;
    @CreatedDate
    private Date createdAt;
    @NotNull
    private Status status;
}
