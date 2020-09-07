package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave4 {
	public static void main(String[] args) {
		int inntekt = parseInt(showInputDialog("bruttoinntekt: "));
		if (inntekt <= 639750 && inntekt >= 254500)
			showMessageDialog(null, (inntekt * 0.042) + " er din trinnskatt");
		else if (inntekt <= 999550 && inntekt >= 639750)
			showMessageDialog(null, (inntekt * 0.132) + " er din trinnskatt");
		else if (inntekt > 999550)
			showMessageDialog(null, (inntekt * 0.162) + " er din trinnskatt");
		else
			showMessageDialog(null, inntekt + " er et ugyldig tall");
	}
	// Inntekten mellom 0 - 180 800 kroner Ingen trinnskatt
	// Trinn 2 Inntekten mellom 254 500 – 639 750 kroner 4,2 % trinnskatt
	// Trinn 3 Inntekten mellom 639 750 – 999 550 kroner 13,2 % trinnskatt *
	// Trinn 4 Inntekten over 999 550 kroner 16,2 % trin
}