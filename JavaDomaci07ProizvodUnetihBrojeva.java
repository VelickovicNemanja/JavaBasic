//Napisati program kojice procitati 3 cela broja sa standardnog ulaza
//i taj program treba da pozove i vrati (u mainu) proizvod unetih brojeva.

package Domaci_2308;

import java.util.Scanner;

public class JavaDomaci07ProizvodUnetihBrojeva {

	static double myMethod(double a, double b, double c) {
		return a * b * c;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Unesi 3 cela broja: ");
		double x = s.nextDouble();
		double y = s.nextDouble();
		double z = s.nextDouble();

		System.out.println("Proizvod brojeva je " + myMethod(x, y, z) + " .");

	}

}
