package com.FastMoving.api_locadora.dao;

import com.FastMoving.api_locadora.model.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartaoDAO extends  JpaRepository<Cartao, Integer> {

    // Busca cartões pelo nome (case insensitive)
    List<Cartao> findByNomeIgnoreCase(String nome);

    // Busca cartões por data de vencimento
    List<Cartao> findByDataVencimento(java.util.Date dataVencimento);

    // Busca cartões com número maior que um valor específico
    List<Cartao> findByNumeroGreaterThan(Long numero);

}
