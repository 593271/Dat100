package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
public class Oppgave5 {
	public static void main(String args[]) {
		for (int i = 1; i < 11; i++) {
			int karakter = parseInt(showInputDialog("Skriv inn poengsummen din: "));
			if (karakter <= 100 && karakter >= 90) {
				System.out.println("Student " + i + " fikk karakteren A ");
			} else if (karakter <= 89 && karakter >= 80) {
				System.out.println("Student " + i + " fikk karakteren B ");
			} else if (karakter <= 79 && karakter >= 60) {
				System.out.println("Student " + i + " fikk karakteren C ");
			} else if (karakter <= 59 && karakter >= 50) {
				System.out.println("Student " + i + " fikk karakteren D ");
			} else if (karakter <= 49 && karakter >= 40) {
				System.out.println("Student " + i + " fikk karakteren E ");
			} else if (karakter <= 39 && karakter >= 0) {
				System.out.println("Student " + i + " fikk karakteren F ");

				
			} else {
				showMessageDialog(null, "feil verdi prøv igjen");
				i--;
			}
		}
	}
}
