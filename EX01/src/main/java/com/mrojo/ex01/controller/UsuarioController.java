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

import com.mrojo.ex01.dto.Usuario;
import com.mrojo.ex01.service.UsuarioService;

/**
 * @author Marc
 *
 */
@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioServiceImpl;

	@GetMapping("/usuarios")
	public List<Usuario> listarUsuarios() {
		return usuarioServiceImpl.listarUsuarios();
	}

	@PostMapping("/usuarios")
	public Usuario salvarUsuario(@RequestBody Usuario usuario) {
		return usuarioServiceImpl.guardarUsuario(usuario);
	}

	@GetMapping("/usuarios/{id}")
	public Usuario usuarioXID(@PathVariable(name = "id") Long id) {

		Usuario Usuario_xid = new Usuario();

		Usuario_xid = usuarioServiceImpl.usuarioXID(id);

		System.out.println("Usuario por ID: " + Usuario_xid);

		return Usuario_xid;
	}

	@PutMapping("/usuarios/{id}")
	public Usuario actualizarPasswordUsuario(@PathVariable(name = "id") Long id, @RequestBody Usuario usuario) {

		Usuario Usuario_seleccionado = new Usuario();
		Usuario Usuario_actualizado = new Usuario();

		Usuario_seleccionado = usuarioServiceImpl.usuarioXID(id);

		//Usuario_seleccionado.setNombre(usuario.getNombre());
		Usuario_seleccionado.setPassword(usuario.getPassword());

		Usuario_actualizado = usuarioServiceImpl.actualizarPasswordUsuario(Usuario_seleccionado);

		System.out.println("El Curso actualizado es: " + Usuario_actualizado);

		return Usuario_actualizado;
	}

	@DeleteMapping("/usuarios/{id}")
	public void eliminarUsuario(@PathVariable(name = "id") Long id) {
		usuarioServiceImpl.eliminarUsuario(id);
	}
}
