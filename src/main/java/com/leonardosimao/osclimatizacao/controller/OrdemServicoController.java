package com.leonardosimao.osclimatizacao.controller;

import com.leonardosimao.osclimatizacao.entity.OrdemServico;
import com.leonardosimao.osclimatizacao.entity.StatusOS;
import com.leonardosimao.osclimatizacao.service.OrdemServicoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ordens")
public class OrdemServicoController {

    private final OrdemServicoService service;

    public OrdemServicoController(OrdemServicoService service) {
        this.service = service;
    }

    @PostMapping
    public OrdemServico abrir(@RequestBody OrdemServico os) {
        return service.abrirOS(os);
    }

    @GetMapping
    public List<OrdemServico> listar() {
        return service.listarTodas();
    }

    // NOVA PORTA: Atualizar Status (Ex: localhost:8080/ordens/1/status?novoStatus=EM_ANDAMENTO)
    @PutMapping("/{id}/status")
    public OrdemServico atualizarStatus(@PathVariable Long id, @RequestParam StatusOS novoStatus) {
        return service.atualizarStatus(id, novoStatus);
    }

    // NOVA PORTA: Finalizar OS (Ex: localhost:8080/ordens/1/finalizar)
    @PutMapping("/{id}/finalizar")
    public OrdemServico finalizar(@PathVariable Long id) {
        return service.finalizarOS(id);
    }
}