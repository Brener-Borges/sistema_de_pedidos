package com.brener.sistema_de_pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brener.sistema_de_pedidos.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
