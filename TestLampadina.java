import java.util.Scanner;

public class TestLampadina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero massimo di click per la lampadina: ");
        int maxClick = scanner.nextInt();

        Lampadina lampadina = new Lampadina(maxClick);

        boolean continua = true;
        while (continua) {
            System.out.println("\nCosa vuoi fare?");
            System.out.println("1. Visualizzare lo stato della lampadina");
            System.out.println("2. Effettuare un click sulla lampadina");
            System.out.println("3. Terminare");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println(lampadina.stato());
                    break;
                case 2:
                    lampadina.click();
                    break;
                case 3:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        }

        scanner.close();
    }
}