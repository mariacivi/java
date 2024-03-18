import java.util.Scanner;

public class ParoleUguali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci la prima parola:");
        String primaParola = input.nextLine();
        
        System.out.println("Inserisci la seconda parola:");
        String secondaParola = input.nextLine();
        
        if (primaParola.equals(secondaParola)) {
            System.out.println("Sono uguali!");
        } else {
            System.out.println("Non sono uguali!");
        }
        
        input.close();
    }
}
