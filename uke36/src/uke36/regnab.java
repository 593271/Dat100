package uke36;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class regnab {

	public static void main(String[] args) {


		int a = parseInt(showInputDialog("Skriv inn a: "));
		int b = parseInt(showInputDialog("Skriv inn b: "));
		int verdi = a/b;
		
		if (b > 0) {
			  System.out.println(verdi);
			} else if (b == 0){
			  System.out.println("feil");
			}
	}
	
}


