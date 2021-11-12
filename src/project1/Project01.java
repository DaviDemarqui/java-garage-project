package project1;

import java.util.Scanner;

public class Project01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How much cars you want to add?");
		int garageSizeAsk = scanner.nextInt();
		
		if(garageSizeAsk == 1) {
			System.out.println("Enter your car name: ");
			String car = scanner.next();
			System.out.println("Your cars: "+car);
		}
		else if(garageSizeAsk == 2) {
			String[] cars = new String[2];
			System.out.println("Enter the name of two cars: ");
			String car1 = scanner.next();
			String car2 = scanner.next();
			cars[0] = car1;
			cars[1] = car2;
			System.out.println("Your cars: "+car1+" "+car2);
		}
		else if(garageSizeAsk == 3) {
			String[] cars = new String[3];
			System.out.println("Enter the name of three cars: ");
			String car1 = scanner.next();
			String car2 = scanner.next();
			String car3 = scanner.next();
			cars[0] = car1;
			cars[1] = car2;
			cars[2] = car3;
			System.out.println("Your cars: "+car1+" "+car2+" "+car3);
		}
		else if(garageSizeAsk == 4) {
			String[] cars = new String[4];
			System.out.println("Enter the name of four cars: ");
			String car1 = scanner.next();
			String car2 = scanner.next();
			String car3 = scanner.next();
			String car4 = scanner.next();
			cars[0] = car1;
			cars[1] = car2;
			cars[2] = car3;
			cars[3] = car4;
			System.out.println("Your cars: "+car1+" "+car2+" "+car3+" "+car4);
		}
		
			
	}
	
	
}
