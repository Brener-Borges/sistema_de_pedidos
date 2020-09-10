package com.brener.sistema_de_pedidos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.brener.sistema_de_pedidos.domain.Categoria;
import com.brener.sistema_de_pedidos.domain.Produto;
import com.brener.sistema_de_pedidos.repositories.CategoriaRepository;
import com.brener.sistema_de_pedidos.repositories.ProdutoRepository;
import com.brener.sistema_de_pedidos.services.exceptions.ObjectNotFoundException;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Produto findById(Integer id){
		Optional<Produto> obj = repository.findById(id);
		return obj.orElseThrow( () -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public Page<Produto> search(String nome, List<Integer> ids, Integer page, Integer linesPerPage, String orderBy, String direction){
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		List<Categoria> categorias = categoriaRepository.findAllById(ids);
		return repository.search(nome, categorias, pageRequest);
	}
}
