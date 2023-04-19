/**
 * 
 */
package com.mrojo.ex01.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrojo.ex01.dto.Party;

/**
 * @author Marc
 *
 */
public interface IPartyDAO extends JpaRepository<Party, Integer> {

}
