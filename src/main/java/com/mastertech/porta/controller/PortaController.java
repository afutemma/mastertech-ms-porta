package com.mastertech.porta.controller;

import com.mastertech.porta.model.Porta;
import com.mastertech.porta.service.PortaService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PortaController {

    @Autowired
    private PortaService service;

    @PostMapping("/porta")
    public ResponseEntity postPorta(@RequestBody Porta porta) {
        return ResponseEntity.ok(service.salvar(porta));
    }


    @GetMapping("/porta/{id}")
    public ResponseEntity getPorta(@PathVariable int id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }
}
