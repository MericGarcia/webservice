package fr.keyconsulting.formation.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class MultiplyOperator extends Operator {

	private static final long serialVersionUID = 1L;
	
	private static final String MULTIPLY = "x";

	@Override
	public BigDecimal operate(Operand leftOperand, Operand rightOperand) {
		return leftOperand.getValue().multiply(rightOperand.getValue());
	}
	
	@Override
	public String getCode() {
		return MULTIPLY;
	}

}
