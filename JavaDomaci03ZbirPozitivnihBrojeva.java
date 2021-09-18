/*While1:Napisati program koji unosi i sabira brojeve dokle
	  god nije unesen negativan broj, 
	  i ispisuje njihov zbir (zbir pozitivnih brojeva).*/

import java.util.Scanner;

public class JavaDomaci03ZbirPozitivnihBrojeva {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a;
		int sum = 0;
		System.out.println("Unesite zeljene brojeve: ");

		a = s.nextInt();

		while (a >= 0) {
			sum += a;
			a = s.nextInt();
		}
		System.out.println("Zbir pozitivnih brojeva koje ste uneli je: " + sum);
		s.close();

	}

}
