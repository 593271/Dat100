package uke36;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class stigende {

	public static void main(String[] args) {

		
		
		int a = parseInt(showInputDialog("Skriv inn a: "));
		int b = parseInt(showInputDialog("Skriv inn b: "));
		int c = parseInt(showInputDialog("Skriv inn c: "));
		
		
		
        if (a < b && b < c)
            System.out.println(a + " " + b + " " + c);
        else if (a < c && c < b)
            System.out.println(a + " " + c + " " + b);
        else if (b < a && a < c)
            System.out.println(b + " " + a + " " + c);
        else if (b < c && c < a)
            System.out.println(b + " " + c + " " + a);
        else if (c < a && a < b)
            System.out.println(c + " " + a + " " + b);
        else if (c < b && b < a)
            System.out.println(c + " " + b + " " + a);

        }
		

	}


