//Napisati program koji ce procitati 3 cela broja sa standardnog ulaza(znaci da korisnik unosi tri broja) 
//i taj program treba da pozove i ispise (u mainu) najmanji od ta tri unesena broja.

package Domaci_2308;

import java.util.Scanner;

public class JavaDomaci07NajmanjiOd3UnetaBroja {

	static double myMethod(double a, double b, double c) {
		if (a >= b) {
			double tmp = a;
			a = b;
			b = tmp;
		}
		if (a <= c) {
			return a;
		} else {
			return c;
		}

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Unesi 3 cela broja: ");
		double x = s.nextDouble();
		double y = s.nextDouble();
		double z = s.nextDouble();

		System.out.println("Najmanji broj je: " + myMethod(x, y, z) + " .");

	}
}