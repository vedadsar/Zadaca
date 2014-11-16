import java.util.Scanner;

/** program provjerava da li je uneseni broj Armstrongov broj.
 * 
 * @author Vedad
 *
 */
public class ArmstrongNumber {
	public static void main(String[] args) {
		int broj;
		int ostatak1;
		int ostatak2;
		int ostatak3;
		int armstrongBroj;

		Scanner in = new Scanner(System.in);

		System.out.println("Unesi jedan cijeli broj od 100 do 999:");
		broj = in.nextInt();

		int prviBroj = broj;
		while ((broj < 10) || (broj > 999)) {

			System.out
					.println("Uneseni broj nije izmedju 100 i 999, unesite ponovo");
			broj = in.nextInt();
		}

		ostatak1 = broj % 10;
		broj = broj / 10;
		ostatak2 = broj % 10;
		broj = broj / 10;
		ostatak3 = broj % 10;
		 int uslov = ostatak1 * ostatak1 * ostatak1 + ostatak2 * ostatak2
				* ostatak2 + ostatak3 * ostatak3 * ostatak3;

		if (uslov==prviBroj) {
			System.out.println("Ovo je Armstrongov broj " +uslov);
		} else
			System.out.println("Broj nije armstrongov broj " +uslov);
		{

		}
	}
}
