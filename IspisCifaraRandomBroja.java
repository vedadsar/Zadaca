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
		int max = 100001;
		//koji je najveci broj koji mozes ovdje dobiti ? Da li je za taj broj ostatak koda validan
		int broj = (int) (min + Math.random() * (max - min + 1));
		System.out.println(broj);
		
		/*trebalo je ispisati cifre u obrnutom redoslijedu - 12345 bi ispisalo 5 4 3 2 1
		  Da li se ovaj kod moze napisati sa mnje varijabli? Pokusaj da mijenjas vrijednost varijable "broj"
		  i da koristis operator za ostatak
		*/
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
