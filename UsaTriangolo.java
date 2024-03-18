import java.Util.Scanner;
public class UsaTriangolo {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Inserisci la base del triangolo: ");
        double base = scanner.nextDouble();

        System.out.print("Inserisci l'altezza del triangolo: ");
        double altezza = scanner.nextDouble();
        TriangoloIsoscele triangolo = new TriangoloIsoscele(base, altezza);
        System.out.println("Area del triangolo: " + triangolo.calcolaArea());
        System.out.println("Perimetro del triangolo: " + triangolo.calcolaPerimetro());
        scanner.close();
    }
}
