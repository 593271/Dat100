package no.hvl.dat100;
import static java.lang.Math.*;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;


public class kulevolum {

	public static void main(String[] args) {
		
		double radius = parseInt(showInputDialog("skriv inn radius"));
		double volum = (4.0/3.0)*PI*pow(radius,3);
		
System.out.println(volum);
		
}
	
}
