import java.util.ArrayList;
import java.util.Scanner;

public class ParoleMisteriose2 {
    public static void main(String[] args) {
        ArrayList<String> parole = new ArrayList<>();
        parole.add("Joyce");
        parole.add("Munro");
        parole.add("Leopardi");
        parole.add("Dante");
        parole.add("Murakami");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Indovina un autore letterario: ");
        
        int tentativiRimasti = 3;
        boolean indovinato = false;
        
        while (tentativiRimasti > 0 && !indovinato) {
            System.out.println("Tentativi rimasti: " + tentativiRimasti);
            System.out.print("Inserisci la parola che pensi sia corretta: ");
            String tentativo = input.nextLine();
            
            if (parole.contains(tentativo)) {
                System.out.println("Complimenti! Hai indovinato la parola corretta: " + tentativo);
                indovinato = true;
            } else {
                System.out.println("La parola inserita non è corretta. Riprova.");
                tentativiRimasti--;
            }
        }
        
        if (!indovinato) {
            System.out.println("Mi dispiace, hai esaurito tutti i tentativi. La parola corretta era una tra: Joyce, Munro, Leopardi, Dante, Murakami");
        }
        
        input.close();
    }
}
