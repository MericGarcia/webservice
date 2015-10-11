package fr.keyconsulting.formation.model;

import java.math.BigDecimal;

public class Result {
	
	BigDecimal value;

	public Result(BigDecimal value){
		this.value = value;
	}
	
	
	public BigDecimal getValue() {
		return value;
	}

}
