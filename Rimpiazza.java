import java.util.Scanner;

public class Rimpiazza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci una frase:");
        String stringa = input.nextLine();
        
        System.out.println("Inserisci il carattere da rimpiazzare:");
        char carattereDaRimpiazzare = input.nextLine().charAt(0); 
        
        System.out.println("Inserisci il carattere con cui rimpiazzare:");
        char carattereDiRimpiazzo = input.nextLine().charAt(0); 
           
        String risultato = stringa.replace(carattereDaRimpiazzare, carattereDiRimpiazzo);
      
        System.out.println("Stringa rimpiazzata: " + risultato);
        
        input.close();
    }
}
