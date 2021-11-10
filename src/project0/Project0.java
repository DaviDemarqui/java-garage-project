package project0;
import java.util.Scanner;

public class Project0 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int firstNumber = scanner.nextInt();
		
		System.out.println("Enter the second number: ");
		int secondNumber = scanner.nextInt();
		
		System.out.println("Choose the operator: ");
		char myOperator = scanner.next().charAt(0);
		
		
		if(myOperator == '+') {
			int result = firstNumber + secondNumber;
			System.out.println("The result is: "+result);
		}
		else if(myOperator == '-') {
			int result = firstNumber - secondNumber;
			System.out.println("The result is: "+result);
		}
		else {
			System.out.println("You enter an invalid operator.");
		}
		
	}
	
}
