/**
 * 
 */
package com.mrojo.ex01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrojo.ex01.dao.IUsuarioDAO;
import com.mrojo.ex01.dto.Usuario;

/**
 * @author Marc
 *
 */
@Service
public class UsuarioService {

	@Autowired
	IUsuarioDAO iUsuarioDAO;
	
	public List<Usuario> listarUsuarios() {
		return iUsuarioDAO.findAll();
	}

	public Usuario guardarUsuario(Usuario usuario) {
		return iUsuarioDAO.save(usuario);
	}

	public Usuario usuarioXID(Long id) {
		return iUsuarioDAO.findById(id).get();
	}

	public Usuario actualizarPasswordUsuario(Usuario usuario) {
		return iUsuarioDAO.save(usuario);
	}

	public void eliminarUsuario(Long id) {
		iUsuarioDAO.deleteById(id);
	}
}
