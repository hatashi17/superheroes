package com.superheroes.gestion.modelo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Personaje {
	
	@Id @GeneratedValue
	private Long id;
	
	private String nombre;
	private String genero;
	private String ojos;
	private String pelo;
	private String origen;
	private String tipo;
	private int altura;
	private int peso;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getOjos() {
		return ojos;
	}
	public void setOjos(String ojos) {
		this.ojos = ojos;
	}
	public String getPelo() {
		return pelo;
	}
	public void setPelo(String pelo) {
		this.pelo = pelo;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public Personaje() {}
		
	
	public Personaje(String nombre, String genero, String ojos, String pelo, String origen, String tipo, int altura,
			int peso) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.ojos = ojos;
		this.pelo = pelo;
		this.origen = origen;
		this.tipo = tipo;
		this.altura = altura;
		this.peso = peso;
	}
	@Override
	public int hashCode() {
		return Objects.hash(altura, genero, id, nombre, ojos, origen, pelo, peso, tipo);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return altura == other.altura && Objects.equals(genero, other.genero) && Objects.equals(id, other.id)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(ojos, other.ojos)
				&& Objects.equals(origen, other.origen) && Objects.equals(pelo, other.pelo) && peso == other.peso
				&& Objects.equals(tipo, other.tipo);
	}
	@Override
	public String toString() {
		return "personaje [id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", ojos=" + ojos + ", pelo=" + pelo
				+ ", origen=" + origen + ", tipo=" + tipo + ", altura=" + altura + ", peso=" + peso + "]";
	}
	
	
	

}
