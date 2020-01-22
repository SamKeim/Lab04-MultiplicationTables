/*
 * 
 * @Author - Sam Keim - GitHub @ SamTheEnby
 */

import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Learn your squares and cubes!");
		String userChoice = "Y";
		
		do {
			System.out.println("Enter an integer:");
			int userInt = scnr.nextInt();
			
			// Headers
			System.out.printf("%-15s %-15s %-15s\n", "Number", "Squared", "Cubed");
			System.out.printf("%-15s %-15s %-15s\n", "=======", "=======", "=======");
			
			// Loop for rows
			for (int i = 1; i <= userInt; i++) {
				System.out.printf("%-15d %-15d %-15d\n", i, i * i, i * i * i);
			}
			
			// Spacing
			System.out.printf("\n\n%9s", "");
			
			// Header for multiplication table
			for (int i = 1; i <= userInt; i++) {
				System.out.printf("%-5d", i);				
			}
			System.out.printf("\n%9s", "");
			for (int i = 1; i <= userInt; i++) {
				System.out.printf("%-5s", "=");				
			}
			// Multiplication table root
			System.out.println("");
			for (int i = 1; i <= userInt; i++) {
				System.out.printf("%-5d|   ", i);
				for (int x = 1; x <= userInt; x++) {
					System.out.printf("%-5d", x * i);
				}
				System.out.println("");
			}
			
			
			System.out.println("Would you like to continue? (Y/N)");
			userChoice = scnr.next();
		} while (userChoice.substring(0,1).equalsIgnoreCase("Y"));
		System.out.println("Thank you, goodbye.");
		scnr.close();
	}

}
