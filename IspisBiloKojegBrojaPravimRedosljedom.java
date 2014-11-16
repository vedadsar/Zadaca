import java.util.Scanner;

public class IspisBiloKojegBrojaPravimRedosljedom {
	public static void main(String args[]) {
		int broj;
		int obrnutiBroj = 0;
		int cifre;
		System.out.println("Unesite cijeli broj ");
		Scanner in = new Scanner(System.in);
		broj = in.nextInt();
		while (broj != 0) {
			obrnutiBroj = obrnutiBroj * 10;
			obrnutiBroj = obrnutiBroj + broj % 10;
			broj = broj / 10;
		}
		while (obrnutiBroj != 0) {
			cifre = obrnutiBroj % 10;
			obrnutiBroj = obrnutiBroj / 10;

			System.out.println(cifre);
		}
	}
}