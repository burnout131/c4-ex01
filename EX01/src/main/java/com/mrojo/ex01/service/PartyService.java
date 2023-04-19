/**
 * 
 */
package com.mrojo.ex01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrojo.ex01.dao.IPartyDAO;
import com.mrojo.ex01.dto.Party;

/**
 * @author Marc
 *
 */

@Service
public class PartyService {

	@Autowired
	IPartyDAO iPartyDAO;

	public List<Party> listarParties() {
		return iPartyDAO.findAll();
	}

	public List<Party> findPartiesByJuegoId(Long juegoId) {
		return iPartyDAO.findPartiesByJuegoId(juegoId);
	}

	public Party guardarParty(Party party) {
		return iPartyDAO.save(party);
	}

	public Party partyXID(Long id) {
		return iPartyDAO.findById(id).get();
	}

	public Party actualizarParty(Party party) {
		return iPartyDAO.save(party);
	}

	public void eliminarParty(Long id) {
		iPartyDAO.deleteById(id);
	}
}
