/**
 * 
 */
package com.mrojo.ex01.service;

import java.util.List;

import com.mrojo.ex01.dto.Usuario;

/**
 * @author Marc
 *
 */
public interface IUsuarioService {
	public List<Usuario> listarUsuarios();
	
	public Usuario guardarUsuario(Usuario usuario);
	
	public Usuario usuarioXID(int id);
	
	public Usuario actualizarPasswordUsuario(Usuario usuario);
	
	public void eliminarUsuario(int id);
}
