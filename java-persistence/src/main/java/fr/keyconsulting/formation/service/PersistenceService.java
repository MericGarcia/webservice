package fr.keyconsulting.formation.service;

import java.util.List;

import fr.keyconsulting.formation.model.Calcul;

public interface PersistenceService {
	
	public void persist(Calcul calcul);
	
	public List<Calcul> load();

}
