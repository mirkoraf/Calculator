package klassen;

public class Calculator {
	
	Double firstNumber;
	Double secondNumber;
	String operator;
	
	public Calculator(Double firstNumber, Double secondNumber, String operator) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.operator = operator;
		
		
	}

	public Double addition(Double firstNumber, Double secondNumber) {
		return firstNumber + secondNumber;
	}

}