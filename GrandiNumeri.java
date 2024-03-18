import java.util.Random;

public class GrandiNumeri {
    public static void main(String[] args) {
        Random random = new Random();
        int conteggioZero = 0;
        int conteggioUno = 0;
        int numeroDiGenerazioni = 1000;
        
        for (int i = 0; i < numeroDiGenerazioni; i++) {
            int numeroGenerato = random.nextInt(2);
            if (numeroGenerato == 0) {
                conteggioZero++;
            } else {
                conteggioUno++;
            }
        }
        
        System.out.println("Numero di Testa generati: " + conteggioZero);
        System.out.println("Numero di Croce generati: " + conteggioUno);
    }
}

