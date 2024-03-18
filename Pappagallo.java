import java.util.Scanner;

public class Pappagallo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci una frase (per terminare, inserisci un comando vuoto):");
        
        while (true) {
            String inputString = input.nextLine();
            
            // Se l'utente ha inserito una stringa vuota, terminiamo il ciclo
            if (inputString.isEmpty()) {
                break;
            }
            
            System.out.println(inputString);
        }
        
        System.out.println("Programma terminato.");
        
        input.close();
    }
}
