package klassen;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
	//	Person p1 = new Person();
	//	p1.nachname = "Müller";
	//	p1.vorname = "Manuel";
	//	
	//	System.out.println(p1.getFullName(7)); 
		
		
	/*	
		BankAccount firstAccount = new BankAccount("001", "Peter Fox");
		
		
		firstAccount.balanceAdd(200.0);
		firstAccount.balanceAdd(100.0);
		firstAccount.balanceSubtract(50.0);
		firstAccount.showDetails();
		
	}
*/
	String operator = "";
	Double firstNumber;
	Double secondNumber;
	
	
	Calculator calculator = new Calculator(0.0 , 0.0 , "");
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
