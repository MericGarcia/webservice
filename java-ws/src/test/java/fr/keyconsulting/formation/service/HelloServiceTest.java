package fr.keyconsulting.formation.service;

import org.junit.Test;
import org.junit.Assert;

public class HelloServiceTest {

	private HelloService service = new HelloService();
	
	@Test
	public void sayHello(){
		Assert.assertEquals("Hello Toto 2!",service.sayHi("Toto"));
	}
	
}
