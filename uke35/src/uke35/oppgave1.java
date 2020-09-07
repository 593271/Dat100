package uke35;

import java.util.Scanner;

public class oppgave7 {
	public static void main(String args[]) {
		/*
		 * This program assumes that the student has 6 subjects, thats why I have
		 * created the array of size 6. You can change this as per the requirement.
		 */
		int marks[] = new int[10];
		int i;
		float total = 0, avg;
		Scanner scanner = new Scanner(System.in);

		for (i = 0; i < 10; i++) {
			System.out.print("Skriv inn poengsummen" + (i + 1) + ":");
			marks[i] = scanner.nextInt();
			total = total + marks[i];
		}
		scanner.close();
		// Calculating average here
		avg = total / 10;
		System.out.print("The student Grade is: ");
		if (avg >= 90 && avg < 100) {
			System.out.print("A");
		} else if (avg >= 80 && avg < 89) {
			System.out.print("B");
		} else if (avg >= 60 && avg < 79) {
			System.out.print("C");
		} else if (avg >= 59 && avg < 50) {
			System.out.print("D");
		} else if (avg >= 0 && avg < 39) {
			System.out.print("E");	

			
			
			
		} else {
			System.out.print("F");
		}
	}
}