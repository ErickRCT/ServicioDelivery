package com.delivery.destinatario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnvioDto {
    private long idEnvio;
    private LocalDate fechaCreacion;
    private String estado;
    private String descripcion;
    private long idCliente;
}
