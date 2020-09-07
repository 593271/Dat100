package uke36;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class oppgave7 {

	public static void main(String[] args) {


		int fakultet = parseInt(showInputDialog("Skriv inn fakulteten: "));
		long ganger = 1;

		for (int i = 1; i <= fakultet; i++) {
			ganger = ganger * i;
			

		}
		System.out.println("svaret blir: " + ganger);

	}

}
