package com.leonardosimao.osclimatizacao.repository;

import com.leonardosimao.osclimatizacao.entity.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {

    List<OrdemServico> findByTecnicoId(Long tecnicoId);
}