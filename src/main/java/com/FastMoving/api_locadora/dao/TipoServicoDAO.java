package com.FastMoving.api_locadora.dao;

import com.FastMoving.api_locadora.model.TipoServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoServicoDAO extends JpaRepository<TipoServico,Integer> {
}
