package com.FastMoving.api_locadora.dao;

import com.FastMoving.api_locadora.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaDAO extends JpaRepository<Empresa,Integer> {
}
