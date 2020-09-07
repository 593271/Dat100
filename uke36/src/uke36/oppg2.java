package uke36;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class oppg2 {

	public static void main(String[] args) {

		int lavest = parseInt(showInputDialog("Skriv inn lavest tall: "));
		int hoyest = parseInt(showInputDialog("Skriv inn høyeste tall: "));

		for (int i = lavest; i <=hoyest ; i++) {

		
		if(i % 2 > 0) 
			showMessageDialog(null, i);
		

	}
		
	}
	
}
