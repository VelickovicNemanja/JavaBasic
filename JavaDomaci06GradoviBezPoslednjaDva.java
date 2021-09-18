package Nizovi;

public class JavaDomaci06GradoviBezPoslednjaDva {

	public static void main(String[] args) {
		/*-Napisati program gde u nizu napisete ovih 5 gradova (Lisabon, London, Helsinki, Prag i Madrid)
		
		 * a program stampa gradove sve dok ne dodje do "Prag"-a*/

		String Li = "Lisabon";
		String Lo = "London";
		String He = "Helsinki";
		String Pr = "Prag";
		String Ma = "Madrid";

		String[] gradovi = { Li, Lo, He, Pr, Ma };
		for (int i = 0; i < gradovi.length; i++) {

			if (gradovi[i] == "Prag") {

				break;

			}
			System.out.println(gradovi[i]);

		}

	}

}
