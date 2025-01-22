package com.FastMoving.api_locadora.dao;

import com.FastMoving.api_locadora.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDAO extends JpaRepository<Cliente ,Integer> {
}
