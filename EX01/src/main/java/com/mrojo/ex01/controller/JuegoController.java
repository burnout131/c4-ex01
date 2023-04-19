/**
 * 
 */
package com.mrojo.ex01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrojo.ex01.dto.Juego;
import com.mrojo.ex01.service.JuegoService;

/**
 * @author Marc
 *
 */

@RestController
@RequestMapping("/api")
public class JuegoController {
	
	@Autowired
	JuegoService juegoService;

	@GetMapping("/juegos")
	public List<Juego> listarJuegos() {
		return juegoService.listarJuegos();
	}

	@GetMapping("/juegos/{id}")
	public Juego juegosXID(@PathVariable(name = "id") Long id) {

		Juego Juego_xid = new Juego();
		Juego_xid = juegoService.juegoXID(id);

		System.out.println("Juego por ID: " + Juego_xid);

		return Juego_xid;
	}

	@PostMapping("/juegos")
	public Juego salvarJuego(@RequestBody Juego juego) {
		return juegoService.guardarJuego(juego);
	}

	@PutMapping("/juegos/{id}")
	public Juego actualizarJuego(@PathVariable(name = "id") Long id, @RequestBody Juego juego) {

		Juego Juego_seleccionado = new Juego(id, juego.getTitulo(), juego.getDescripcion());
		Juego Juego_actualizado = new Juego();

		Juego_actualizado = juegoService.actualizarJuego(Juego_seleccionado);

		System.out.println("El Curso actualizado es: " + Juego_actualizado);

		return Juego_actualizado;
	}

	@DeleteMapping("/juegos/{id}")
	public void eliminarJuego(@PathVariable(name = "id") Long id) {
		juegoService.eliminarJuego(id);
	}
}
