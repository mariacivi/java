import java.util.Scanner;

public class UsaRettangolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner (System.in);
		Rettangolo r1 = new Rettangolo(10, 5);
		System.out.println(r1);
		System.out.println("Ha l'area di " + r1.calcolaArea());
		System.out.println("Ha il perimetro di " + r1.calcolaPerimetro());
		int scelta = 5;
		do {
			
			System.out.println("Cosa vuoi fare 0 per terminare altro tasto per continuare");
			scelta = input.nextInt();
			if (scelta != 0) {
			System.out.println("Inserisci base");
			double base = input.nextDouble();
			System.out.println("Inserisci altezza");
			double altezza = input.nextDouble();
			Rettangolo r2 = new Rettangolo(base, altezza);
			System.out.println(r2);
			System.out.println("Ha l'area di " + r2.calcolaArea());
			System.out.println("Ha il perimetro di " + r2.calcolaPerimetro());
			
			}
		}
			
			while (scelta != 0);
			
	}

}