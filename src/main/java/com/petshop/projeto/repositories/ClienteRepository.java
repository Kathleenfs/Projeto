package com.petshop.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petshop.projeto.entities.Cliente;



public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}