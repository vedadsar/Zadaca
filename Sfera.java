package com.zvedad.zadaca;

import java.util.Scanner;

/**
 * Zadatak izracunava  zapreminu Sfere. korisnik unosi vrijednost
 * poluprecnika.
 * 
 * @author Vedad
 *
 */

public class Sfera {
	public static void main(String[] args) {
		double poluprecnik;
		double visina;

		Scanner in = new Scanner(System.in);
		System.out.println("Unesite vrijednost stranice ");
		poluprecnik = in.nextDouble();

		Scanner in1 = new Scanner(System.in);
		System.out.println("Unesite vrijednost visine piramide ");
		visina = in1.nextDouble();

		double zapreminaSfere = (double) ((2 * poluprecnik * poluprecnik
				* Math.PI * visina)/3);
		System.out.println("Zapremina sfere je " + zapreminaSfere);

	}
}
