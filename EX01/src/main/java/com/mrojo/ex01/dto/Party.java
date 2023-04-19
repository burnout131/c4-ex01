/**
 * 
 */
package com.mrojo.ex01.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author Marc
 *
 */

@Entity
@Table(name="party")
public class Party {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "descripcion")
	private String descripcion;
	
	@ManyToOne
    @JoinColumn(name = "usuario_id")
	Usuario usuario;
	
	@ManyToOne
    @JoinColumn(name = "juego_id")
	Juego juego;

	public Party() {
		super();
	}

	/**
	 * @param id
	 * @param nombre
	 * @param descripcion
	 * @param usuario
	 * @param juego
	 */
	public Party(int id, String nombre, String descripcion, Usuario usuario, Juego juego) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.usuario = usuario;
		this.juego = juego;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the juego
	 */
	public Juego getJuego() {
		return juego;
	}

	/**
	 * @param juego the juego to set
	 */
	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	@Override
	public String toString() {
		return "Party [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", usuario=" + usuario
				+ ", juego=" + juego + "]";
	}
	
}
