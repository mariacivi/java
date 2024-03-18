import java.util.ArrayList;
import java.util.Scanner;

public class GestoreLibreria {
    public static void main(String[] args) {
        ArrayList<Libro> libreria = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        String scelta;

       
        do {
            System.out.println("Scegli un'operazione:");
            System.out.println("1. Aggiungi un nuovo libro");
            System.out.println("2. Stampare tutti i libri");
            System.out.println("3. Esci");

            scelta = scanner.nextLine();

            switch (scelta) {
                case "1":
                    System.out.println("Inserisci il titolo del libro:");
                    String titolo = scanner.nextLine();
                    System.out.println("Inserisci il nome dell'autore:");
                    String autore = scanner.nextLine();
                    Libro nuovoLibro = new Libro(titolo, autore);
                    libreria.add(nuovoLibro);
                    System.out.println("Libro aggiunto con successo!");
                    break;
                case "2":
                    if (libreria.isEmpty()) {
                        System.out.println("La libreria è vuota.");
                    } else {
                        System.out.println("Libri nella libreria:");
                        for (Libro libro : libreria) {
                            System.out.println(libro);
                        }
                    }
                    break;
                case "3":
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        } while (!scelta.equals("3"));

        scanner.close();
    }
}