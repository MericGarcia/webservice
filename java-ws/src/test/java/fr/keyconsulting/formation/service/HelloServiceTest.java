package fr.keyconsulting.formation.service;

import org.junit.Test;
import org.junit.Assert;

public class HelloServiceTest {

	private HelloService service = new HelloService();
	
	@Test
	public void sayHello(){
		Assert.assertEquals("Hello Toto",service.sayHi("Toto"));
	}
	
}
