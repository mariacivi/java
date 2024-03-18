import java.util.Scanner;

public class ContaNumeriCrescenti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci una sequenza di numeri interi crescenti:");
        
        int lunghezza = 0;
        int numeroPrecedente = Integer.MIN_VALUE; // Impostiamo il numero precedente al valore minimo possibile per gestire il primo input
        
        while (true) {
            int numero = input.nextInt();
            
            if (numero <= numeroPrecedente) {
                break; // Se il numero inserito è minore o uguale al precedente, termina il ciclo
            }
            
            lunghezza++;
            numeroPrecedente = numero;
        }
        
        System.out.println("La lunghezza della sequenza inserita è: " + lunghezza);
        
        input.close();
    }
}
