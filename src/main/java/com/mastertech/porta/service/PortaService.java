package com.mastertech.porta.service;

import com.mastertech.porta.model.Porta;
import com.mastertech.porta.repository.PortaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class PortaService {

    @Autowired
    private PortaRepository repository;

    public Porta salvar(Porta porta){
        return repository.save(porta);
    }

    public Optional<Porta> buscarPorId(int id){
        return repository.findById(id);
    }
}
