package com.delivery.destinatario.entity;

import com.delivery.destinatario.dto.EnvioDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Destinatario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDestinatario;
    private String nombreDestinatario;
    private String apellidoDestinatario;
    private String rut;
    private String direccionDestinatario;
    private String telefonoDestinatario;
}
