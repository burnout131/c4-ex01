/**
 * 
 */
package com.mrojo.ex01.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrojo.ex01.dto.Party;

public interface IPartyDAO extends JpaRepository<Party, Long> {
	
	public List<Party> findPartiesByJuegoId(Long gameId);
	
}
