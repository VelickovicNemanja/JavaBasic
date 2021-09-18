//Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i poziva i ispisuje dve metode.
//Prva ispisuje zbir tri unesena broja, a druga vraca najveci od unetih brojeva

package Domaci_2308;

import java.util.Scanner;

public class JavaDomaci07ZbirINajveciBroj {
	static double zbir(double a, double b, double c) {
		return a + b + c;
	}

	static double najveciBroj(double a, double b, double c) {
		if (a <= b) {
			double tmp = a;
			a = b;
			b = tmp;
		}
		if (a >= c) {
			return a;
		} else {
			return c;
		}

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite 3 cela broja: ");
		double x = s.nextDouble();
		double y = s.nextDouble();
		double z = s.nextDouble();

		double zbir = zbir(x, y, z);
		double najveciBroj = najveciBroj(x, y, z);

		System.out.println("Zbir unesenih brojeva je " + zbir + " ,\r\na najveci medju njima je " + najveciBroj + " .");
	}

}