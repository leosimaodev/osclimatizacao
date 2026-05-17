package com.leonardosimao.osclimatizacao.service;

import com.leonardosimao.osclimatizacao.exception.EntidadeNaoEncontradaException;
import com.leonardosimao.osclimatizacao.entity.OrdemServico;
import com.leonardosimao.osclimatizacao.entity.StatusOS;
import com.leonardosimao.osclimatizacao.repository.OrdemServicoRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrdemServicoService {

    private final OrdemServicoRepository repository;

    public OrdemServicoService(OrdemServicoRepository repository) {
        this.repository = repository;
    }

    // 1. Abre a OS 
    public OrdemServico abrirOS(OrdemServico os) {
        os.setDataAbertura(LocalDateTime.now());
        os.setStatus(StatusOS.ABERTA);
        return repository.save(os);
    }

    // 2. Lista todas 
    public List<OrdemServico> listarTodas() {
        return repository.findAll();
    }

    // 3. NOVA REGRA: Mudar o status (ex: para EM_ANDAMENTO)
    public OrdemServico atualizarStatus(Long id, StatusOS novoStatus) {
        OrdemServico os = repository.findById(id)
                .orElseThrow(() -> new EntidadeNaoEncontradaException("Ordem de Serviço não encontrada!"));
        
        os.setStatus(novoStatus);
        return repository.save(os);
    }

    // 4. NOVA REGRA: Finalizar a OS e colocar a data de fechamento
    public OrdemServico finalizarOS(Long id) {
        OrdemServico os = repository.findById(id)
                .orElseThrow(() -> new EntidadeNaoEncontradaException("Nao foi possivel encontrar!"));

        os.setStatus(StatusOS.CONCLUIDA);
        os.setDataFechamento(LocalDateTime.now()); // Registra o momento exato do fim do serviço
        return repository.save(os);
    }
    // NOVA REGRA: Buscar ordens por técnico
    public List<OrdemServico> listarPorTecnico(Long tecnicoId) {
        return repository.findByTecnicoId(tecnicoId);
    }
}