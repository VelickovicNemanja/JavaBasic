/*Napisati program koji oponasa kviz za pogadjanje glavnog grada.
	- Program treba da ispisuje 3 opcije za izbor drzave + 1 opciju kao izlaz z programa.
	    1. Francuska
	    2. Italija
	    3. Srbija
	    4. Izlaz
	- Nakon odabira drzave, potrebno je postaviti pitanje 'Koji je glavni grad drzave xxxxxxx ?'
	- Ako korisnik odgovori tacno, ispisuje se poruka 'Odgovor je tacan'
	- Ako korisnik odgovori netacno, ispisuje se poruka 'Odgovor nije tacan'
	- Nakon davanja odgovora (bilo da je tacan ili netacan), ponovo treba da se postave
	sve pocetne opcije i ponudi korisniku da odabere neku od njih.
	- Program se zavrsava kad korisni odabere 4. opciju 'Izlaz'
	- Program uraditi koriscenjem dosad naucenog + do-while petlje*/

import java.util.Scanner;

public class JavaDomaci04GradoviKviz {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int i;
		String grad;
		boolean b = true;

		do {
			System.out.println("Izaberite broj drzave: ");
			System.out.println("1. Francuska");
			System.out.println("2. Italija");
			System.out.println("3. Srbija");
			System.out.println("4. Izlaz");
			i = s.nextInt();

			switch (i) {
			case 1:
				System.out.println("Koji je glavni grad Francuske?");
				grad = s.next();
				grad = grad.trim();
				grad = grad.toLowerCase();
				if (grad.equals("pariz"))
					System.out.println("Odgovor je tacan.");
				else
					System.out.println("Odgovor nije tacan");
				break;
			case 2:
				System.out.println("Koji je glavni grad Italije?");
				grad = s.next();
				grad = grad.trim();
				grad = grad.toLowerCase();
				if (grad.equals("rim"))
					System.out.println("Odgovor je tacan.");
				else
					System.out.println("Odgovor nije tacan");
				break;
			case 3:
				System.out.println("Koji je glavni grad Srbije?");
				grad = s.next();
				grad = grad.trim();
				grad = grad.toLowerCase();
				if (grad.equals("beograd"))
					System.out.println("Odgovor je tacan.");
				else
					System.out.println("Odgovor nije tacan");
				break;
			case 4:
				b = false;
				break;
			}

		} while (b);
		s.close();

		System.out.println("Program je zavrsen.");
	}

}
