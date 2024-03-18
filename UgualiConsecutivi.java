import java.util.Scanner;

public class UgualiConsecutivi {
    public static void main(String[] args) {
        final int NUM_ELEMENTI = 10;
        Scanner input = new Scanner(System.in);
        int[] numeri = new int[NUM_ELEMENTI];
        System.out.println("Inserisci " + NUM_ELEMENTI + " numeri:");
        for (int i = 0; i < NUM_ELEMENTI; i++) {
            numeri[i] = input.nextInt();
        }
        System.out.println("Numeri e posizioni di elementi immediatamente preceduti dallo stesso elemento:");
        for (int i = 1; i < NUM_ELEMENTI; i++) {
                System.out.println("Numero: " + numeri[i] + ", Posizione: " + i);
    }
}
}