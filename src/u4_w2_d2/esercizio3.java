package u4_w2_d2;

import java.util.HashMap;
import java.util.Map;

public class esercizio3 {

	private Map<String, String> contatti;

	public esercizio3() {
		contatti = new HashMap<>();
	}

	public void inserisciContatto(String nome, String telefono) {
		contatti.put(nome, telefono);
	}

	public void cancellaContatto(String nome) {
		contatti.remove(nome);
	}

	public String cercaTelefono(String nome) {
		return contatti.get(nome);
	}

	public String cercaNome(String telefono) {
		for (Map.Entry<String, String> entry : contatti.entrySet()) {
			if (entry.getValue().equals(telefono)) {
				return entry.getKey();
			}
		}
		return null;
	}

	public void stampaContatti() {
		for (Map.Entry<String, String> entry : contatti.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

	}

}
