package com.delivery.destinatario.service;

import com.delivery.destinatario.dto.EnvioDto;
import com.delivery.destinatario.entity.Destinatario;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface DestinatarioService {

    List<EnvioDto> obtenerPorIdCliente(long idCliente);

    void save(Destinatario destinatario);

    List<Destinatario> findAll();
}
