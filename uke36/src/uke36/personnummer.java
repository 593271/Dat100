package uke36;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class personnummer {

	public static void main(String[] args) {

		
		
		int personnummer = parseInt(showInputDialog("personnummer: "));

		int kjønn1 = personnummer / 100;
		
		int kjønn2 = kjønn1 % 10;
		

             if (kjønn2%2 == 0)
                 System.out.println("du er kvinne");
             else 
                 System.out.println("du er mann");
		
	}

}
