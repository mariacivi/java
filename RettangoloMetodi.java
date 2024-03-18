import java.util.Scanner;
public class RettangoloMetodi {
 
	public static void main(String[] args) {
 
		Scanner scan= new Scanner(System.in);
 
		System.out.println("Inserisci la base e l'altezza");
		int base = scan.nextInt();
		int altezza = scan.nextInt();
 
		calcolaRettangolo(base, altezza);
		calcolaTriangolo(base, altezza);
 
	}
 
	public static void calcolaRettangolo(int base, int altezza) {
		int area = base * altezza;
		int perimetro = (base*2) + (altezza*2);
		System.out.println("Il perimetro del rettangolo è: " + perimetro);
		System.out.println("L'area del rettangolo è: " + area);
	}
 
	public static void calcolaTriangolo(int base, int altezza) {
		int area = (base * altezza)/2;
		System.out.println("L'area del triangolo è: " + area);
	}
 
}