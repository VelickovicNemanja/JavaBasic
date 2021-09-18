//Napisati program gde korisnik unosi pozitivne brojeve, kad unese
//negativan broj prikaze mu se suma svih prethodno unetih brojeva
//i na kraju zakomentarisati koje ste brojeve sve unosili po testu

package Domaci_1908;

import java.util.Scanner;

public class JavaDomaci05PozitivniBrojevi {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double x = 0;
		double zbir = 0;

		while (x >= 0) {

			System.out.print("Unesite broj: ");
			x = s.nextDouble();

			if (x < 0) {
				break;
			}

			zbir = zbir + x;

		}
		System.out.println("Zbir prethodno unetih brojeva je: " + zbir);

		// test 2.5, 5, 10 i -1

	}

}
