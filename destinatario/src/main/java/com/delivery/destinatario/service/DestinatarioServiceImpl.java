package com.delivery.destinatario.service;

import com.delivery.destinatario.dto.EnvioDto;
import com.delivery.destinatario.entity.Destinatario;
import com.delivery.destinatario.repository.DestinatarioRepository;
import com.delivery.destinatario.repository.EnvioApi;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DestinatarioServiceImpl implements DestinatarioService {

    private DestinatarioRepository destinatarioRepository;

    private EnvioApi envioApi;

    @Override
    public List<EnvioDto> obtenerPorIdCliente(long idCliente) {
        return envioApi.obtenerPorIdCliente(idCliente);
    }

    @Override
    public void save(Destinatario destinatario) {
        destinatarioRepository.save(destinatario);
    }

    @Override
    public List<Destinatario> findAll() {
        return destinatarioRepository.findAll();
    }
}
