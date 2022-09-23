package com.superheroes.gestion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.superheroes.gestion.modelo.Usuario;
import com.superheroes.gestion.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository repository;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	public Usuario registarUsuario(Usuario u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		return repository.save(u);
	}
	
	public Usuario findById(long id) {
		return repository.findById(id).orElse(null);
	}
	
	public Usuario buscarPorMail(String email) {
		return repository.findFirstByEmail(email);
	}
	
}
