package klassen;

public class Calculator {

	Double firstNumber;
	Double secondNumber;
	// String operator;
	// String calcExit;
	// String exitVar;

	public Calculator(Double firstNumber, Double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	

	}

	public Double addition(Double firstNumber, Double secondNumber) {
		return firstNumber + secondNumber;
	}

	public Double subtraction(Double firstNumber, Double secondNumber) {
		return firstNumber - secondNumber;
	}

	public Double multiplication(Double firstNumber, Double secondNumber) {
		return firstNumber * secondNumber;
	}

	public Double division(Double firstNumber, Double secondNumber) {
		return firstNumber / secondNumber;
	}

	/* public Boolean exitCalc(String exitVar) {
		System.out.println(exitVar);
		if (this.exitVar == "Y") {
			
			return false;
		} else {
			return true;
		}

	}
 */
}
