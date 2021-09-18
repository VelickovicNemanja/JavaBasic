package Nizovi;

public class JavaDomaci06_GradoviBezPrvogIPoslednjeg {

	public static void main(String[] args) {
		/*
		 * -Napisati program gde u nizu napisete 5 gradova, a program vam odstampa sve
		 * osim prvog i poslednjeg unosa.
		 */

		String Li = "Lisabon";
		String Lo = "London";
		String He = "Helsinki";
		String Pr = "Prag";
		String Ma = "Madrid";

		String[] gradovi = { Li, Lo, He, Pr, Ma };
		for (int i = 0; i < gradovi.length; i++) {

			if (gradovi[i] == "Lisabon") {

				continue;

			}
			if (gradovi[i] == "Madrid") {
				continue;
			}
			System.out.println(gradovi[i]);

		}
	}
}
