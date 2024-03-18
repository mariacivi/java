import java.util.Scanner;

public class ParoleMisteriose {
    public static void main(String[] args) {
        String[] parole = {"gatto", "cane", "topo", "pesce", "uccello"};
        Scanner input = new Scanner(System.in);
        
        System.out.println("Indovina una parola del mondo animale:");
        
        int tentativiRimasti = 3;
        boolean indovinato = false;
        
        while (tentativiRimasti > 0 && !indovinato) {
            System.out.println("Tentativi rimasti: " + tentativiRimasti);
            System.out.print("Inserisci la parola che pensi sia corretta: ");
            String tentativo = input.nextLine();
            
            for (String parola : parole) {
                if (tentativo.equals(parola)) {
                    System.out.println("Complimenti! Hai indovinato la parola corretta: " + tentativo);
                    indovinato = true;
                    break;
                }
            }
            
            if (!indovinato) {
                System.out.println("La parola inserita non è corretta. Riprova.");
                tentativiRimasti--;
            }
        }
        
        if (!indovinato) {
            System.out.println("Mi dispiace, hai esaurito tutti i tentativi. La parola corretta era una tra: gatto, cane, topo, pesce, uccello");
        }
        
        input.close();
    }
}
