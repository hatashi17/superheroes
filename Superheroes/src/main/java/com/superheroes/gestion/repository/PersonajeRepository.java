package com.superheroes.gestion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superheroes.gestion.modelo.Personaje;

public interface PersonajeRepository extends JpaRepository<Personaje,Long>{
	
	List<Personaje> findByNombre(String nombre);
	
	List<Personaje> findAll();

}
