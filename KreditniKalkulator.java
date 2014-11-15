package com.zvedad.zadaca;

import java.util.Scanner;

/** Kreditni kalkulator u kojem korisnik unosi vrijednost glavnice, 
 * kamatne stope u procentima i broj mjeseci za otplatu. Program ce izracunati
 * ukupan dug sa kamatom te mjesecnu ratu.
 * @author Vedad
 *
 */

public class KreditniKalkulator {
	public static void main(String[] args) {
		double glavnica;
		double kamata;
		int mjesec;

		Scanner in = new Scanner(System.in);
		System.out.println("Unosite vrijednost glavnice ");
		glavnica = in.nextDouble();
		
		//ima li potrebe za 2 odnosno 3 inputa (Scanner-a) ?
		Scanner in1 = new Scanner(System.in);
		System.out.println("Unesite procentualnu vrijednost kamatne stope ");
		kamata = in1.nextDouble();

		Scanner in2 = new Scanner(System.in);
		System.out.println("Unesite broj mjeseci za otplatu kredita ");
		mjesec = in2.nextInt();
        double procKamata = kamata/100;
		double ukupanDug = glavnica * procKamata + glavnica;
		System.out.println("Ukupan dug koji cete vrati je " + ukupanDug +" KM");
		double mjesecnaRata = ukupanDug / mjesec;
		System.out.println("Mjesecna rata za vas kredit je " + mjesecnaRata +" KM");
	}
}
