import java.util.Random;

public class SlotMachine {
    public static void main(String[] args) {
        Random random = new Random();
        
        int iterazioniMassime = 10;
        int iterazioni = 0;
        
        while (iterazioni < iterazioniMassime) {
            int numero1 = random.nextInt(10);
            int numero2 = random.nextInt(10);
            int numero3 = random.nextInt(10);
            
            System.out.println("[" + numero1 + "] [" + numero2 + "] [" + numero3 + "]");
            
           
            if (numero1 == numero2 && numero2 == numero3) {
                System.out.println("Hai fatto jackpot!");
                return; 
            }
            
            iterazioni++;
        }
        System.out.println("Credito esaurito.");
    }
}
