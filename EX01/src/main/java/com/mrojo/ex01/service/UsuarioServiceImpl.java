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
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	IUsuarioDAO iUsuarioDAO;

	@Override
	public List<Usuario> listarUsuarios() {
		return iUsuarioDAO.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		return iUsuarioDAO.save(usuario);
	}

	@Override
	public Usuario usuarioXID(int id) {
		return iUsuarioDAO.findById(id).get();
	}

	@Override
	public Usuario actualizarPasswordUsuario(Usuario usuario) {
		return iUsuarioDAO.save(usuario);
	}

	@Override
	public void eliminarUsuario(int id) {
		iUsuarioDAO.deleteById(id);
	}
}
