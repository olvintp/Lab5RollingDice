package Lab5RollingDice;

import java.util.Scanner;

public class lab5RollingDice {

	public static void main(String[] args) {
			
		System.out.println("Welcome to Grand Circus Casino!");
			Scanner sc = new Scanner (System.in);
		System.out.println("Roll the dice? (y/n): ");
		String choice = "y";
		
		
		while (true) {

				System.out.print("Continue? 'y' or 'n'");
	//get input from user, to know how to roll the dice
			choice = sc.nextLine();
			System.out.println();
		
	int rollDice(int number, int nSides) {
		int num = 0;
		if (nSides >= 3) {
		
			for (int i = 0; i < number; i++) 
				Random r = new Random();
				int roll = r.nextInt();
				num = num + (roll % nSides) + 1;

			
		} else {
			System.out.println("Error num needs to be from 3");

		}
		return num;
	}
}

}
