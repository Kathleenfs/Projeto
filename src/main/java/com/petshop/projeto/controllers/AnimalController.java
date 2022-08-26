package com.petshop.projeto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petshop.projeto.entities.Animal;
import com.petshop.projeto.repositories.AnimalRepository;

@RestController
@RequestMapping(value = "/animal")

public class AnimalController {
	
	
	@Autowired 
	private AnimalRepository repository;
	
	@GetMapping
	public List<Animal> findAll() { // metodo usando findAll para trazer tudo do banco

		List<Animal> result = repository.findAll(); // manda uma consulta para o banco de Dados e retorna uma lista
		return result;
	}

	
	
}
