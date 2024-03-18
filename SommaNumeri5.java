import java.util.ArrayList;
import java.util.Scanner;

public class SommaNumeri5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numeri = new ArrayList<>();
        System.out.println("Inserisci i numeri (inserisci 0 per terminare l'inserimento):");
        while (true) {
            int numero = input.nextInt();
            if (numero == 0) {
                break;
            }
            numeri.add(numero);
        }
        int somma = 0;
        for (int numero : numeri) {
            somma += numero;
        }
        System.out.println("La somma dei numeri inseriti è: " + somma);
        
        input.close();
    }
}
