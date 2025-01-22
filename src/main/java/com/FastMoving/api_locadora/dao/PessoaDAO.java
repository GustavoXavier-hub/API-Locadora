package com.FastMoving.api_locadora.dao;

import com.FastMoving.api_locadora.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaDAO  extends JpaRepository<Pessoa,Integer> {
}
