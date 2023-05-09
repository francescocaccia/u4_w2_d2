package u4_w2_d2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class esercizio2 {

	public static void main(String[] args) {

		int N = 10;
		List<Integer> listaCasuale = generaListaCasuale(N);
		System.out.println("Lista casuale ordinata: " + listaCasuale);
		List<Integer> listaInvertita = inverteLista(listaCasuale);
		System.out.println("Lista invertita: " + listaInvertita);
		System.out.println("Stampa valori in posizioni pari: ");
		stampaValori(listaInvertita, true);
		System.out.println("Stampa valori in posizioni dispari: ");
		stampaValori(listaInvertita, false);
	}

//primo metodo per creare una lista casuale ordinata
	public static List<Integer> generaListaCasuale(int N) {
		List<Integer> lista = new ArrayList<>();
		Random rand = new Random();
		for (int i = 0; i < N; i++) {
			lista.add(rand.nextInt(101));
		}
		Collections.sort(lista);
		return lista;
	}

	public static List<Integer> inverteLista(List<Integer> lista) {
		List<Integer> listaInvertita = new ArrayList<>(lista);
		Collections.reverse(listaInvertita);
		lista.addAll(listaInvertita);
		return lista;
	}

	public static void stampaValori(List<Integer> lista, boolean pari) {
		for (int i = pari ? 0 : 1; i < lista.size(); i += 2) {
			System.out.print(lista.get(i) + " ");
		}
		System.out.println();

	}

}
