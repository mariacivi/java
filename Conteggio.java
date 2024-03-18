import java.util.Scanner;

public class Conteggio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci un numero maggiore o uguale a zero:");
        int numero = input.nextInt();
        
        if (numero >= 0) {
            System.out.println("Numeri da 0 a " + numero + ":");
            for (int i = 0; i <= numero; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Errore: Il numero inserito è negativo.");
        }
        
        input.close();
    }
}