package com.delivery.envio.controller;

import com.delivery.envio.entity.Envio;
import com.delivery.envio.service.EnvioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/envio")
@AllArgsConstructor
public class EnvioController {

    private EnvioService envioService;

    @PostMapping("/crear")
    public ResponseEntity<String> crearEnvio(@RequestBody Envio envio) {
        envioService.saveEnvio(envio);
        return ResponseEntity.ok("Envio creado correctamente");
    }

    @GetMapping("/obtenerPorIdCliente/{idCliente}")
    public ResponseEntity<List<Envio>> obtenerPorIdCliente(@PathVariable long idCliente) {
        List<Envio> envios = envioService.findByIdCliente(idCliente);
        if (envios.isEmpty() || envios == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(envios);
        }

    }

    @GetMapping("/obtenerTodo")
    public ResponseEntity<List<Envio>> obtenerTodo() {
        List<Envio> envios = envioService.findAll();
        if (envios.isEmpty() || envios == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(envios);
        }
    }
}
