//Napisati program gde preko skenera unesete broj, ako je broj manji od 10 onda ga 
//pomnoziti sa 100, ako je broj veci od 100 onda ga podeliti sa 10. Na kraju 
//zakomentarisite koje brojeve ste koristili za proveru programa.

import java.util.Scanner;

public class JavaDomaci02Brojevi {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite broj: ");

		double broj = s.nextDouble();
		double a = broj * 100;
		double b = broj / 10;
		if (broj < 10) {
			System.out.println("Rezultat pomnozen sa 100 je: " + a);
		} else if (broj > 100) {
			System.out.println("Rezultat podeljen sa 100 je: " + b);
		} else {
			System.out.println("Pogresan broj");
		}

		System.out.println("Program je zavrsen");
		s.close();

		// Za proveru ispravnosti programa sam koristio brojeve 0, 9, 10, 100 i 101
	}

}
