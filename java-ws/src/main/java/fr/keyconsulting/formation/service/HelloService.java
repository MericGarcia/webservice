package fr.keyconsulting.formation.service;

import fr.keyconsulting.formation.service.IHelloService;

public class HelloService implements IHelloService {

	@Override
	public String sayHi(String name) {
		return "Hello " + name + "!";
	}

}
