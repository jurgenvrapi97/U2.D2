package ESERCIZIO_2;

import java.util.List;
import java.util.Scanner;

import static ESERCIZIO_2.Main.*;

public class ES_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        List<Integer> lista = generaLista(number);
        System.out.println("Lista originale: " + lista);

        lista = duplicaInverti(lista);
        System.out.println("Lista duplicata e invertita: " + lista);

        System.out.println("Valori in posizioni pari:");
        stampaPosizioni(lista, true);

        System.out.println("Valori in posizioni dispari:");
        stampaPosizioni(lista, false);
    }
}
