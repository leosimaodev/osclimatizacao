package com.leonardosimao.osclimatizacao.repository;

import com.leonardosimao.osclimatizacao.entity.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {
}