import java.util.Scanner;

public class DomandaRisposta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci una stringa:");
        String stringa = input.nextLine();
        
        char ultimoCarattere = stringa.charAt(stringa.length() - 1);
        
        if (ultimoCarattere == '?') {
            System.out.println("Non saprei...");
        } else if (ultimoCarattere == '!') {
            System.out.println("Hai proprio ragione!");
        } else {
            System.out.println("Mmmm, non mi convince...");
        }
        
        input.close();
    }
}
