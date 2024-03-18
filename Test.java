import java.util.Random;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
    	 Scanner input = new Scanner (System.in);
    	Quesito[] quesiti = {
            new Quesito("Qual è la capitale dell'Italia?", "Roma", 10),
            new QuesitoSiNo("Il Sole sorge ad est?", "si", 5),
            new QuesitoNumerico("Quanto fa 2+2?", "4", 8),
            new QuesitoMultiplo("Quale di queste città è capitale dell'Australia?", "3", 7, 4)
        };

        Random random = new Random();
        int[] indices = random.ints(0, quesiti.length).distinct().limit(3).toArray();
        int punteggioTotale = 0;
        for (int index : indices) {
            punteggioTotale += quesiti[index].ask();
        }
        System.out.println("Punteggio totale: " + punteggioTotale);
    }
}