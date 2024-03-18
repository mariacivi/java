import java.util.Scanner;
public class ScrivoScrivoScrivo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci un numero maggiore o uguale a zero:");
        int numero = input.nextInt();
        
        if (numero >= 0) {
            System.out.println("Sto ciclando un numero di volte pari a " + numero);
            for (int i = 0; i < numero; i++) {
                System.out.println("Ciclo numero " + (i + 1));
            }
        } else {
            System.out.println("Errore: Il numero inserito è negativo.");
        }
        
        input.close();
    }

	}


