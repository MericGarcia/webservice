package fr.keyconsulting.formation.model;

import java.util.HashMap;
import java.util.Set;

public abstract class Operators {

	private static HashMap<String, Operator> operators = new HashMap<>();

	static {
		registerOperator(new PlusOperator());
		registerOperator(new MinusOperator());
		registerOperator(new MultiplyOperator());
		registerOperator(new DivideOperator());
	}

	public static Set<String> all() {
		return operators.keySet();
	}

	public static Operator of(String opAsString) {
		return operators.get(opAsString);
	}

	private static void registerOperator(Operator operator) {
		operators.put(operator.getCode(), operator);
	}

}
