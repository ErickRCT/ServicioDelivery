package com.delivery.envio.service;

import com.delivery.envio.entity.Envio;
import java.util.List;

public interface EnvioService {

    List<Envio> findByIdCliente(long idCliente);

    void saveEnvio(Envio envio);

    List<Envio> findAll();

}
