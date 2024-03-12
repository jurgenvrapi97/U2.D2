package ESERCIZIO_3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private HashMap<String, String> rubrica;

    public RubricaTelefonica() {
        this.rubrica = new HashMap<>();
    }


    public void inserisci(String nome, String telefono) {
        this.rubrica.put(nome, telefono);
    }


    public void cancella(String nome) {
        this.rubrica.remove(nome);
    }


    public String cercaPersona(String telefono) {
        for (Map.Entry<String, String> entry : this.rubrica.entrySet()) {
            if (entry.getValue().equals(telefono)) {
                return entry.getKey();
            }
        }
        return null;
    }


    public String cercaTelefono(String nome) {
        return this.rubrica.get(nome);
    }


    public void stampaContatti() {
        for (Map.Entry<String, String> entry : this.rubrica.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Telefono: " + entry.getValue());
        }
    }
}
