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

import com.mrojo.ex01.dto.Party;
import com.mrojo.ex01.service.PartyService;

/**
 * @author Marc
 *
 */

@RestController
@RequestMapping("/api")
public class PartyController {
	
	@Autowired
	PartyService partyService;
	
	@GetMapping("/parties")
	public List<Party> listarParties() {
		return partyService.listarParties();
	}

	@GetMapping("/parties/{id}")
	public Party partyXID(@PathVariable(name = "id") Long id) {
		Party partyxID = new Party();

		partyxID = partyService.partyXID(id);

		return partyxID;
	}

	@GetMapping("/parties/juego/{juegoId}")
	public List<Party> findPartiesByJuegoId(@PathVariable(name = "juegoId") Long juegoId) {
		return partyService.findPartiesByJuegoId(juegoId);
	}

	@PostMapping("/parties")
	public Party guardarParty(@RequestBody Party party) {
		return partyService.guardarParty(party);
	}

	@PutMapping("/parties/{id}")
	public Party actualizarParty(@PathVariable(name = "id") Long id, @RequestBody Party party) {
		Party selectedParty = new Party(id, party.getNombre(), party.getDescripcion(), party.getUsuario(), party.getJuego());
		Party updatedParty = new Party();

		updatedParty = partyService.actualizarParty(selectedParty);
		return updatedParty;
	}

	@DeleteMapping("/parties/{id}")
	public void deleteParty(@PathVariable(name = "id") Long id) {
		partyService.eliminarParty(id);
	}
}
