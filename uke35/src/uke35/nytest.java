
package uke35;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class nytest {

	public static void main(String[] args) {

		
		String karTxt = showInputDialog("Tallkarakter: ");
		int tallkarakter = parseInt(karTxt);
		String karakter;
		int test = 0;
		switch (tallkarakter) {
		case 5:
			test = 5*2; karakter = "A"; break;
		case 4: karakter = "B"; break;
		case 3: karakter = "C"; break;
		case 2: karakter = "D"; break;
		case 1: karakter = "E"; break;
		case 0: karakter = "F"; break;
		default: karakter = "ugyldig karakter";
		}
		showMessageDialog(null, karakter + "og" + test);
	}

}
