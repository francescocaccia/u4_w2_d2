package u4_w2_d2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Inserisci il numero di elementi da inserire: ");
		int N = input.nextInt();

		Set<String> parole = new HashSet<>();
		Set<String> paroleDuplicate = new HashSet<>();

		for (int i = 0; i < N; i++) {
			System.out.print("Inserisci la parola " + (i + 1) + ": ");
			String parola = input.next(); // next() --> per prendere in carico solo una parola
			if (!parole.add(parola)) {
				paroleDuplicate.add(parola);
			}
		}

		System.out.println("Parole duplicate: " + paroleDuplicate);
		System.out.println("Numero di parole distinte: " + parole.size());
		System.out.println("Elenco delle parole distinte: " + parole);

	}

}
