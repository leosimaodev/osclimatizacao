package com.leonardosimao.osclimatizacao.controller;

import com.leonardosimao.osclimatizacao.entity.Tecnico;
import com.leonardosimao.osclimatizacao.service.TecnicoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tecnicos")
public class TecnicoController {

    private final TecnicoService service;

    public TecnicoController(TecnicoService service) {
        this.service = service;
    }

    @PostMapping
    public Tecnico salvar(@RequestBody Tecnico tecnico) {
        return service.salvar(tecnico);
    }

    @GetMapping
    public List<Tecnico> listar() {
        return service.listarTodos();
    }
}