package com.delivery.destinatario.controller;

import com.delivery.destinatario.dto.EnvioDto;
import com.delivery.destinatario.entity.Destinatario;
import com.delivery.destinatario.service.DestinatarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/destinatario")
@AllArgsConstructor
public class DestinatarioController {

    private DestinatarioService destinatarioService;

    @PostMapping("/crear")
    public ResponseEntity<String> crear(@RequestBody Destinatario destinatario) {
        destinatarioService.save(destinatario);
        return ResponseEntity.ok("Destinatario creado con exito");
    }

    @GetMapping("/obtenerEnvios/{idCliente}")
    public ResponseEntity<List<EnvioDto>> obtenerEnvios(@PathVariable long idCliente) {
        List<EnvioDto> envios = destinatarioService.obtenerPorIdCliente(idCliente);
        if (envios.isEmpty() || envios == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(envios);
        }
    }

    @GetMapping("/obtenerTodo")
    public ResponseEntity<List<Destinatario>> obtenerTodo() {
        List<Destinatario> destinatarios = destinatarioService.findAll();

        if (destinatarios.isEmpty() || destinatarios == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(destinatarios);
        }
    }
}
