package com.FastMoving.api_locadora.dao;

import com.FastMoving.api_locadora.model.Prestador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestadorDAO extends JpaRepository<Prestador,Integer> {
}
