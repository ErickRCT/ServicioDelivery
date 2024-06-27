package com.delivery.destinatario.repository;

import com.delivery.destinatario.dto.EnvioDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "envioApi",url = "http://localhost:8082/envio")
public interface EnvioApi {

    @GetMapping("/obtenerPorIdCliente/{idCliente}")
    List<EnvioDto> obtenerPorIdCliente(@PathVariable("idCliente") long idCliente);
}
