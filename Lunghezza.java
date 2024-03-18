import java.util.Scanner;

public class Lunghezza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci una stringa:");
        String stringa = input.nextLine();
        
        int lunghezza = stringa.length();
        
        System.out.println("La lunghezza della stringa inserita è: " + lunghezza);
        
        input.close();
    }
}
