package com.zvedad.zadaca;

import java.util.Scanner;

/**
 * Zadatak izracunava obim i zapreminu cetverostrane piramide. korisnik unosi
 * vrijednost stranice baze piramide i visinu piramide.
 * 
 * @author Vedad
 *
 */

public class Piramida {
	public static void main(String[] args) {
		double stranica;
		double visina;

		Scanner in = new Scanner(System.in);
		System.out.println("Unesite vrijednost stranice ");
		stranica = in.nextDouble();

		Scanner in1 = new Scanner(System.in);
		System.out.println("Unesite vrijednost visine piramide ");
		visina = in1.nextDouble();

		double baza = stranica * stranica;
		double zapreminaPiramide = (double) ((stranica * visina) / 3);
		double bocneStranicePiramide = (double) ((stranica * visina) / 2);
		double obimPiramide = (double) (4 * bocneStranicePiramide + baza);

		System.out.println("Zapremina piramide je " + zapreminaPiramide);
		System.out.println("Obim piramide je " + obimPiramide);

	}
}
