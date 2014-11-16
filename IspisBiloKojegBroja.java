import java.util.Scanner;

public class IspisBiloKojegBroja {
	public static void main(String[] args) {

		int broj;
		int cifre;
		Scanner in = new Scanner(System.in);

		System.out.println("Unesi jedan cijeli broj ");
		broj = in.nextInt();

		while (broj != 0) {
			cifre = broj % 10;
			broj = broj / 10;

			System.out.println(cifre);
		}
	}
}
