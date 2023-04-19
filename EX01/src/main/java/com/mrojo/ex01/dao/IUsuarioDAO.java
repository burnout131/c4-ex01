/**
 * 
 */
package com.mrojo.ex01.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrojo.ex01.dto.Usuario;

/**
 * @author Marc
 *
 */
public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

}
