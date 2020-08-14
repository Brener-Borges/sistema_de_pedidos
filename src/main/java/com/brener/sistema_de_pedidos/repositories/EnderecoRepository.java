package com.brener.sistema_de_pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brener.sistema_de_pedidos.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
