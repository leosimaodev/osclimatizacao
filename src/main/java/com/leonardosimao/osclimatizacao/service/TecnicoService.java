package com.leonardosimao.osclimatizacao.service;

import com.leonardosimao.osclimatizacao.entity.Tecnico;
import com.leonardosimao.osclimatizacao.repository.TecnicoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TecnicoService {

    private final TecnicoRepository repository;

    public TecnicoService(TecnicoRepository repository) {
        this.repository = repository;
    }

    public Tecnico salvar(Tecnico tecnico) {
        return repository.save(tecnico);
    }

    public List<Tecnico> listarTodos() {
        return repository.findAll();
    }
}