package fr.keyconsulting.formation.service;

import javax.jws.WebService;

@WebService
public interface IHelloService {

	public String sayHi(String name);

}