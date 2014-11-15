package com.zvedad.zadaca;

/**
 * Program bira nasumican broj izmedju 10000 i 100000 te ispisuje njegove cifre
 * svaku cifru u zaseban red
 * 
 * @author Vedad
 *
 */
public class IspisCifaraRandomBroja {
	public static void main(String[] args) {
		int min = 10000;
		int max = 10000;

		int broj = (int) (min + Math.random() * (max - min + 1));
		System.out.println(broj);
		
		int petiBroj = (int) broj / 10000;
		System.out.println(petiBroj);
		
		int petiOstatak = (int) broj % 10000;
		int cetvrtiBroj = (int) petiOstatak / 1000;
		System.out.println(cetvrtiBroj);
		
		int cetvrtiOstatak = (int) petiOstatak % 1000;
		int treciBroj = (int) cetvrtiOstatak / 100;
		System.out.println(treciBroj);
		
		int treciOstatak = (int) cetvrtiOstatak % 100;
		int drugiBroj = (int) treciOstatak / 10;
		System.out.println(drugiBroj);
		
		int drugiOstatak = (int) treciOstatak % 10;
		int prviBroj = (int) drugiOstatak;
		System.out.println(prviBroj);
	}
}
