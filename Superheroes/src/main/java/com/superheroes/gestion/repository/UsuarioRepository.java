package com.superheroes.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superheroes.gestion.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Usuario findFirstByEmail(String username);

}
