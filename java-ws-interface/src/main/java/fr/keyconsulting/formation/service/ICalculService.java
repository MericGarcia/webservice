package fr.keyconsulting.formation.service;

import java.util.List;

import javax.jws.WebService;

import fr.keyconsulting.formation.model.Calcul;

@WebService
public interface ICalculService {

	public List<Calcul> getAll();

	public void addCalcul(Calcul calc);

}