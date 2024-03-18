import java.util.Scanner;

public class SpezzaMeta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci una frase:");
        String stringa = input.nextLine();
        
        int lunghezza = stringa.length();
        int meta = lunghezza / 2;
        
        String primaMeta = lunghezza % 2 == 0 ? stringa.substring(0, meta) : stringa.substring(0, meta + 1);
        String secondaMeta = stringa.substring(meta);
        
        System.out.println(primaMeta);
        System.out.println(secondaMeta);
        
        input.close();
    }
}
