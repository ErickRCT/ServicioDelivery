package com.delivery.envio.service;

import com.delivery.envio.entity.Envio;
import com.delivery.envio.repository.EnvioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EnvioServiceImpl implements EnvioService {

    private EnvioRepository envioRepository;

    @Override
    public List<Envio> findByIdCliente(long idCliente) {
        return envioRepository.findByIdCliente(idCliente);
    }

    @Override
    public void saveEnvio(Envio envio) {
        envioRepository.save(envio);
    }

    @Override
    public List<Envio> findAll() {
        return envioRepository.findAll();
    }
}
