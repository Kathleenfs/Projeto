package com.petshop.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petshop.projeto.entities.Animal;

public interface AnimalRepository extends JpaRepository<Animal,Long>{
	

}
