
public class SlotMachine1 {
    public static void main(String[] args) {
        int iterazioniMassime = 10;
        int iterazioni = 0;
        
        while (iterazioni < iterazioniMassime) {
            int numero1 = (int) (Math.random() * 10);
            int numero2 = (int) (Math.random() * 10);
            int numero3 = (int) (Math.random() * 10);
            
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