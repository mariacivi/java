import java.util.Scanner;

public class Cerca2 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci un numero da cercare nell'array:");
        int numeroDaCercare = input.nextInt();
        
        boolean presente = false;
        int indice = 0;
        while (indice < array.length) {
            if (array[indice] == numeroDaCercare) {
                presente = true;
                break; 
            }
            indice++;
        }
        
        if (presente) {
            System.out.println("Presente");
        } else {
            System.out.println("Assente");
        }
        
        input.close();
    }
}
