package fr.keyconsulting.formation.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class PlusOperator extends Operator {

	private static final long serialVersionUID = 1L;

	private static final String PLUS = "+";

	@Override
	public BigDecimal operate(Operand leftOperand, Operand rightOperand) {
		return leftOperand.getValue().add(rightOperand.getValue());
	}

	@Override
	public String getCode() {
		return PLUS;
	}

}
