/**
 * 
 */
package com.mrojo.ex01.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrojo.ex01.dto.Juego;

/**
 * @author Marc
 *
 */
public interface IJuegoDAO extends JpaRepository<Juego, Integer> {

}
