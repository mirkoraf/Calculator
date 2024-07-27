package klassen;

public class Calculator {
	
	Double firstNumber;
	Double secondNumber;
	String operator;
	
	public Calculator(Double firstNumber, Double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		
		
		
	}

	public Double addition(Double firstNumber, Double secondNumber) {
		return firstNumber + secondNumber;
	}

}