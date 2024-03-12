package ESERCIZIO_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static List<Integer> generaLista(int N) {
        List<Integer> lista = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            lista.add(rand.nextInt(101));
        }
        Collections.sort(lista);
        return lista;
    }

    public static List<Integer> duplicaInverti(List<Integer> lista) {
        List<Integer> nuovaLista = new ArrayList<>(lista);
        Collections.reverse(lista);
        nuovaLista.addAll(lista);
        return nuovaLista;
    }

    public static void stampaPosizioni(List<Integer> lista, boolean isPari) {
        for (int i = 0; i < lista.size(); i++) {
            if ((i % 2 != 0) == isPari) {
                System.out.println(lista.get(i));
            }
        }
    }
}