package com.petshop.projeto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petshop.projeto.entities.Cliente;
import com.petshop.projeto.repositories.ClienteRepository;

@RestController
@RequestMapping(value = "/cliente")

public class ClienteController {

	@Autowired  // para pode realizar a injeção de dependencia . Não precisa dar new para
				// instaciar um obj
	private ClienteRepository repository;

	@GetMapping
	public List<Cliente> findAll() { // metodo usando findAll para trazer tudo do banco

		List<Cliente> result = repository.findAll(); // manda uma consulta para o banco de Dados e retorna uma lista
		return result;
	}

	@PostMapping
	public Cliente insert(@RequestBody Cliente cliente) {
		Cliente result = repository.save(cliente);
		return result;
	}

}
