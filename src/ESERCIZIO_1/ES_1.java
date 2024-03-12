package ESERCIZIO_1;

import java.util.*;

public class ES_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un intero N:");
        int number = scanner.nextInt();
        scanner.nextLine();

        List<String> parole = new ArrayList<>();
        System.out.println("Inserisci " + number + " parole:");
        for (int i = 0; i < number; i++) {
            parole.add(scanner.nextLine());
        }

        Set<String> paroleDistinte = new HashSet<>(parole);
        List<String> paroleDuplicate = new ArrayList<>();

        for (String parola : parole) {
            if (Collections.frequency(parole, parola) > 1 && !paroleDuplicate.contains(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("Parole duplicate: " + paroleDuplicate);
        System.out.println("Numero di parole distinte: " + paroleDistinte.size());
        System.out.println("Elenco delle parole distinte: " + paroleDistinte);
    }
}
