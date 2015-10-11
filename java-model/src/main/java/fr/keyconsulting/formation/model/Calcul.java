package fr.keyconsulting.formation.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

@Entity
public class Calcul implements Serializable, ICalcul {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToOne(cascade=CascadeType.ALL)
	@Attribute
	Operand leftOperand;
    
	@OneToOne(cascade=CascadeType.ALL)
	@Attribute
	Operand rightOperand;

	@OneToOne(cascade=CascadeType.ALL)
	@Attribute
	Operator operator;

	@Attribute
	DateTime time;

	@Attribute
	String commentary;
	
	@Attribute
	String author;

	public Calcul() {
		this(null, null, null);
	}
	
	public Calcul(Operand leftOperand, Operator operator, Operand rightOperand) {
		this(leftOperand, operator, rightOperand, new DateTime() , null);
	}

	public Calcul(Operand leftOperand, Operator operator, Operand rightOperand, String commentary) {
		this(leftOperand, operator, rightOperand, new DateTime(), commentary);
	}
	
	public Calcul(Operand leftOperand, Operator operator, Operand rightOperand, DateTime time) {
		this(leftOperand, operator, rightOperand, time, null);
	}

	public Calcul(Operand leftOperand, Operator operator, Operand rightOperand, DateTime time, String commentary) {
		super();
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
		this.operator = operator;
		this.time = time;
		this.commentary = commentary;
	}

	public Result execute() {		
		if(operator == null) {
			throw new IllegalStateException("No operator specified");
		}
		Result result = new Result(operator.operate(leftOperand, rightOperand));
		time = new DateTime();
		return result;
	}

    public long getId() {
		return id;
	}
    
	@XmlJavaTypeAdapter(DateTimeXmlAdapter.class)
	public DateTime getTime() {
		return time;
	}

	public String getCalculAsString() {
		StringBuilder sb = new StringBuilder();
		sb.append(author);
		sb.append(" - ");
		sb.append(commentary);
		return sb.toString();
	}

	public Operand getLeftOperand() {
		return leftOperand;
	}

	public void setLeftOperand(Operand leftOperand) {
		this.leftOperand = leftOperand;
	}

	public Operand getRightOperand() {
		return rightOperand;
	}

	public void setRightOperand(Operand rightOperand) {
		this.rightOperand = rightOperand;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public void setTime(DateTime time) {
		this.time = time;
	}	


	public String getCommentary() {
		return commentary;
	}

	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}
	

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
