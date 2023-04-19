/**
 * 
 */
package com.mrojo.ex01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrojo.ex01.dao.IJuegoDAO;
import com.mrojo.ex01.dto.Juego;

/**
 * @author Marc
 *
 */
@Service
public class JuegoService {
	
	@Autowired
	IJuegoDAO iJuegoDAO;
	
	public List<Juego> listarJuegos() {
		return iJuegoDAO.findAll();
	}

	public Juego guardarJuego(Juego juego) {
		return iJuegoDAO.save(juego);
	}

	public Juego juegoXID(Long id) {
		return iJuegoDAO.findById(id).get();
	}

	public Juego actualizarJuego(Juego juego) {
		return iJuegoDAO.save(juego);
	}

	public void eliminarJuego(Long id) {
		iJuegoDAO.deleteById(id);
	}
}
