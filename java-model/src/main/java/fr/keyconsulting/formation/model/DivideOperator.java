package fr.keyconsulting.formation.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.persistence.Entity;

@Entity
public class DivideOperator extends Operator {

	private static final long serialVersionUID = 1L;
	
	private static final String DIVIDE = "/";
	private static int SCALE = 10;

	@Override
	public BigDecimal operate(Operand leftOperand, Operand rightOperand) {
		BigDecimal left = leftOperand.getValue();
		BigDecimal right = rightOperand.getValue();
		return left.divide(right,SCALE,RoundingMode.HALF_UP);
	}
	
	@Override
	public String getCode() {
		return DIVIDE;
	}

}
