package com.superheroes.gestion;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.superheroes.gestion.modelo.Personaje;
import com.superheroes.gestion.modelo.Usuario;
import com.superheroes.gestion.service.PersonajeService;
import com.superheroes.gestion.service.UsuarioService;

@SpringBootApplication
public class SuperheroesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperheroesApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner initData(PersonajeService personajeService,UsuarioService usuarioService) {
		return args->{
			
			Usuario usuario = new Usuario("Iban","iban.upv@gmail.com","hola");
			usuario = usuarioService.registarUsuario(usuario);
			
			Usuario usuario2 = new Usuario ("Admin", "admin@local.com", "admin");
			usuario2 = usuarioService.registarUsuario(usuario2):
			
//			usuarioRepository.saveAll(Arrays.asList(
//					new Usuario("Iban","iban.upv@gmail.com","hola"),
//					new Usuario("Admin", "admin@local.com", "admin")
//					));
			
//			personajeRepository.saveAll(Arrays.asList(
//					new Personaje("Batman", "Masculino", "Negros", "Moreno", "DC", "Heroe", 185, 90),
//					new Personaje("Superman", "Masculino", "Marrones", "Moreno", "DC", "Heroe", 195, 100),
//					new Personaje("Viuda Negra", "Femenino", "Verdes", "Moreno", "Marvel", "Heroe", 165, 60)
//					));
			
			List<Personaje> listadoPersonajes = Arrays.asList(
					new Personaje("Batman", "Masculino", "Negros", "Moreno", "DC", "Heroe", 185, 90),
					new Personaje("Superman", "Masculino", "Marrones", "Moreno", "DC", "Heroe", 195, 100),
					new Personaje("Viuda Negra", "Femenino", "Verdes", "Moreno", "Marvel", "Heroe", 165, 60)
					);
			
			listadoPersonajes.forEach(personajeService::insertarPersonaje);
					
		};
	}

}
