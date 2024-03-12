package ESERCIZIO_3;

import java.util.Scanner;

public class ES_3 {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (i != 0) {
            System.out.println("inserisci un nuovo contatto in rubrica");
            System.out.println("inserisci il nome");
            String nome = scanner.nextLine();
            System.out.println("inserisci il numero");
            String numero = scanner.nextLine();
            rubrica.inserisci(nome, numero);

            System.out.println("hai inserito un nuovo numero premi 1 per inserirne uno nuovo oppure 0 per terminare");
            i = Integer.parseInt(scanner.nextLine());
        }

        int n = 100;

        while (n != 0) {

            System.out.println("cosa vuoi fare?");
            System.out.println("0. per uscire dal menù");
            System.out.println("1. per cancellare un contatto");
            System.out.println("2. per cercare una contatto con il suo telefono");
            System.out.println("3. per cercare un numero con il suo nome");
            System.out.println("4. per visuallizare tutti i contatti");
            n = Integer.parseInt(scanner.nextLine());


            switch (n) {

                case 0:
                    System.out.println("finito!!!");
                    break;

                case 1:
                    System.out.println("inserisci il nome da cancellare");
                    String nomeDaEliminare = scanner.nextLine();
                    rubrica.cancella(nomeDaEliminare);
                    break;

                case 2:
                    System.out.println("inserisci il numero del contatto");
                    String numero = scanner.nextLine();
                    System.out.println("il numero appartiene a: " + rubrica.cercaPersona(numero));
                    break;
                case 3:
                    System.out.println("inserisci il nome del contatto");
                    String nome = scanner.nextLine();
                    System.out.println("il numero di " + nome + ":" + rubrica.cercaTelefono(nome));
                    break;
                case 4:
                    System.out.println("ecco tutti i contatti");
                    rubrica.stampaContatti();
                    break;
                default:
                    System.out.println("spiacente non è una operazione valida");
                    break;
            }
        }


    }

}
