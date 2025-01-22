package com.FastMoving.api_locadora.dao;

import com.FastMoving.api_locadora.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoDAO extends JpaRepository<Veiculo,Integer> {
}
