package fr.keyconsulting.formation.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.xml.bind.annotation.XmlSeeAlso;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@XmlSeeAlso({PlusOperator.class,MinusOperator.class,DivideOperator.class,MultiplyOperator.class})
public abstract class Operator implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	public abstract BigDecimal operate(Operand leftOperand, Operand rightOperand);
	
	public abstract String getCode();
	
}
