import java.util.Scanner;

public class Cerca {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci un numero da cercare nell'array:");
        int numeroDaCercare = input.nextInt();
        
        boolean presente = false;
        
        
        for (int elemento : array) {
            if (elemento == numeroDaCercare) {
                presente = true;
                break;}
        if (presente) {
            System.out.println("Presente");
        } else {
            System.out.println("Assente");
        }
        
        input.close();
    }
        int numeroDaCercare1 = input.nextInt();
        
        boolean presente1 = false;
        int indice = 0;
        
       
        while (indice < array.length) {
            if (array[indice] == numeroDaCercare1) {
                presente1 = true;
                break; 
            }
            indice++;
        }
       
        if (presente1) {
            System.out.println("Presente");
        } else {
            System.out.println("Assente");
        }
        
        input.close();
    }
}
