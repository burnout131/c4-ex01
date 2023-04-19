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
public class PartyService implements IPartyService {

	@Autowired
	IPartyDAO iPartyDAO;

	@Override
	public List<Party> listarParties() {
		return iPartyDAO.findAll();
	}

	@Override
	public List<Party> partyPorIdJuego(Long juegoId) {
		return iPartyDAO.findPartiesByJuego(juegoId);
		//return null;
	}

	@Override
	public Party guardarParty(Party party) {
		return iPartyDAO.save(party);
	}

	@Override
	public Party partyXID(Long id) {
		return iPartyDAO.findById(id).get();
	}

	@Override
	public Party actualizarParty(Party party) {
		return iPartyDAO.save(party);
	}

	@Override
	public void eliminarParty(Long id) {
		iPartyDAO.deleteById(id);
	}
}
