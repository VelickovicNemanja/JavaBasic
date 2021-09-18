/*
		 * While2: Napisati program koji ce na standardnom izlazu ispisati poruku “Laku
		 * noc!” onoliko puta koliko je korisnik zadao
		 */

import java.util.Scanner;

public class JavaDomaci03LakuNoc_while {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a;
		int i = 0;
		System.out.print("Koliko puta zelite ispisati poruku? ");
		a = s.nextInt();
		s.close();

		while (i < a) {
			System.out.println("Laku noc!");
			++i;

		}
	}
}