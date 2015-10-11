package fr.keyconsulting.formation.model;

import org.joda.time.DateTime;

public interface ICalcul {
	
	public String getCalculAsString();
	
	public Result execute();

	public Operand getLeftOperand();
	
	public Operand getRightOperand();

	public Operator getOperator();
	
	public void setLeftOperand(Operand leftOperand);
	
	public void setRightOperand(Operand rightOperand);

	public void setOperator(Operator operator);

	public DateTime getTime();

}
