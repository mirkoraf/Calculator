package klassen;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
	Double firstNumber;
	Double secondNumber;
	String operator = "";
	Boolean calcRun = true;
	String exitVar = "";

	Calculator calculator = new Calculator(0.0, 0.0);
	Scanner scanner = new Scanner(System.in);

	while (calcRun) {

		System.out.println("Rechenart eingeben (+ | - | * | /)");
		operator = scanner.nextLine();

		System.out.println("Erste Zahl");
		firstNumber = Double.parseDouble(scanner.nextLine());

		System.out.println("Zweite Zahl");
		secondNumber = Double.parseDouble(scanner.nextLine());

		switch (operator) {
		case "+": {
			System.out.println("Ergebnis ist " + calculator.addition(firstNumber, secondNumber));
			break;
		}
		case "-": {
			System.out.println("Ergebnis ist " + calculator.subtraction(firstNumber, secondNumber));
			break;
		}
		case "*": {
			System.out.println("Ergebnis ist " + calculator.multiplication(firstNumber, secondNumber));
			break;
		}
		case "/": {
			System.out.println("Ergebnis ist " + calculator.division(firstNumber, secondNumber));
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + operator);
		}

		System.out.println("Exit program? Y/N ?");
		exitVar = scanner.nextLine();
		if (exitVar.equals("Y")) { // methode .equals() for string comparing, == is for boolean!!!
			calcRun = false;
		} else {
			calcRun = true;
		}

	}

}

}
