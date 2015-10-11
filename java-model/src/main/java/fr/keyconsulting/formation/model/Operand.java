package fr.keyconsulting.formation.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Operand implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private BigDecimal value;

	public Operand() {
		super();
	}

	public Operand(String operandAsText) {
		this.value = new BigDecimal(operandAsText);
	}

	public Operand(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
