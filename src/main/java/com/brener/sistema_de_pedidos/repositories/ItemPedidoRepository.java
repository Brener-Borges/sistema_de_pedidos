package com.brener.sistema_de_pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brener.sistema_de_pedidos.domain.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer>{

}
