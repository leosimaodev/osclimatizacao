package com.leonardosimao.osclimatizacao.repository;

import com.leonardosimao.osclimatizacao.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}