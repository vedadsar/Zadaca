/**
 * Napisati funkciju koja za neku unesenu recenicu(string) ispisuje sve simetricne rijeci
(palindrome), odnosno sve rijeci koje se citaju jednako sa obje strane. Takve rijeci su 
naprimjer Ana, kapak, pop.
 */
import java.util.Scanner;

public class Zadatak7 {

	/**
	 * Funkcija okrece jedan string i ispisuje niz stringova okrenutim
	 * redosljedom.
	 * 
	 * @param rijec
	 * @return
	 */
	public static String[] okrenutiString(String rijec) {

		String[] nizRijec = new String[rijec.length()];
		String slovo;

		for (int i = 0; i <= rijec.length() - 1; i++) {
			slovo = "" + rijec.charAt(i);
			nizRijec[i] = slovo;

		}
		String[] okrenutaRijec = new String[rijec.length()];
		for (int i = nizRijec.length - 1; i >= 0; i--) {
			System.out.print(nizRijec[i] + "");
		}
		return okrenutaRijec;
	}

	public static String[] nizRijeci(String str) {

		String[] nizStringova = new String[str.length()];
		String novaRijec = "";
		char karakter = ' ';
		int i = 0, j = 0;

		while (i < str.length()) {
			if (str.charAt(i) != karakter) {
				novaRijec = novaRijec + str.substring(i, i + 1);

			} else {
				nizStringova[j] = novaRijec;
				j++;
				novaRijec = "";
			}

			i++;

		}

		for (int k = 0; k < nizStringova.length; k++) {

			System.out.print(nizStringova[k] + " ");
		}

		return nizStringova;
	}

	public static void porediti(String[] str1, String[] str2) {

		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {

				if ((str1[i].equalsIgnoreCase(str2[j])) && str1[i] != null) {
					System.out.println("Vasa recenica sadrzi palindrome "
							+ str1[i] + " = " + str2[j]);
				}

			}

		}
	}

	public static void main(String[] args) {
		String recenica = "ana ana ana pop pop pop pop pop" + " ";
		

		porediti(nizRijeci(recenica), okrenutiString(recenica));

	}
}