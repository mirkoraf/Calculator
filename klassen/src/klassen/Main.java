package klassen;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
	Double firstNumber;
	Double secondNumber;
	String operator ="",
	
	
	Calculator calculator = new Calculator(0.0 , 0.0);
	Scanner scanner = new Scanner(System.in);
	
	while(true) {
	
	System.out.println("Rechenart eingeben (+ | - | * | / ):");
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
	default:
		throw new IllegalArgumentException("Unexpected value: " + operator);
	}
	
}


}

}
