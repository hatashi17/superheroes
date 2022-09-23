package com.superheroes.gestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superheroes.gestion.modelo.Personaje;
import com.superheroes.gestion.repository.PersonajeRepository;

@Service
public class PersonajeService {
	
	@Autowired
	PersonajeRepository repository;
	
	public Personaje insertarPersonaje(Personaje p) {
		return repository.save(p);
	}
	
	public void borrar(long id) {
		repository.deleteById(id);
	}
	
	public void borrarPersonaje(Personaje p) {
		repository.delete(p);
	}
	
	public Personaje editar(Personaje p) {
		return repository.save(p);
	}
	
	public Personaje findById(long id) {
		return repository.findById(id).orElse(null);
	}

	public List<Personaje> findAll(){
		return repository.findAll();
	}
	
}
