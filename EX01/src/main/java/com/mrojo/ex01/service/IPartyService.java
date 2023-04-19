/**
 * 
 */
package com.mrojo.ex01.service;

import java.util.List;

import com.mrojo.ex01.dto.Party;

/**
 * @author Marc
 *
 */
public interface IPartyService {
	public List<Party> listarParties();

	public List<Party> partyPorIdJuego(Long juegoId);

	public Party guardarParty(Party party);

	public Party partyXID(Long id);

	public Party actualizarParty(Party party);

	public void eliminarParty(Long id);
}
