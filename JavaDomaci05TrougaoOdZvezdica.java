//Napisati program koji stampa sliku na ekranu za N redova. N unosi korisnik preko skenera.

package Domaci_1908;

import java.util.Scanner;

public class JavaDomaci05TrougaoOdZvezdica {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj redova (N): ");
		int brojRedova = s.nextInt();
		int i;
		String a = "";

		for (i = 0; i < brojRedova; i++) {
			a = a + "*";
			System.out.println(a);
		}
	}

}
