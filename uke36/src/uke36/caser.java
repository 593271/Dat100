package uke36;

import static javax.swing.JOptionPane.showInputDialog;

public class caser {

	public static void main(String[] args) {

		int dag = Integer.parseInt(showInputDialog("skriv inn måned"));
		switch (dag) {
		case 1:
			System.out.println("Januar");
			break;
		case 2:
			System.out.println("Februar");
			break;
		case 3:
			System.out.println("Mars");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("Mai");
			break;
		case 6:
			System.out.println("juni");
			break;
		case 7:
			System.out.println("juli");
			break;
		case 8:
			System.out.println("august");
			break;
		case 9:
			System.out.println("september");
			break;
		case 10:
			System.out.println("oktober");
			break;
		case 11:
			System.out.println("november");
			break;
		case 12:
			System.out.println("desember");
			break;
		}

	}

}
