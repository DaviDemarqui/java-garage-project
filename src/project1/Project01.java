package project1;

import java.util.Random;

public class Project01 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int age = 0;
		int year = 1969;
		int month = 1;
		
		while(age <= 120) {
			
			month++;
			
			int deathAge = random.nextInt(120);
			
			String[] deathCauses = {"IN A CAR CRASH", "IN WAR", "BEING ROBBED", "FALLING OF YOUR HOUSE ROOF", "BY DRUG OVERDOSE", "WITH CANCER", "BECAUSE OF AN HEART ATTACK"};
			int index = random.nextInt(deathCauses.length);
			
			System.out.println("Month: "+month);
			System.out.println("Year: "+year);
			
			if(month == 12) {
				month = 1;
				year++;
				age++;
			}
			
			//Death if statement
			if(age == deathAge) {
				System.out.println("YOU DIED AT AGE "+age+" IN THE YEAR "+year+" "+deathCauses[index]);
				break;
			}
			
		}

	}
	
}
