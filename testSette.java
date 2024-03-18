import java.util.Scanner;

public class testSette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int numero = ((int) (Math.random() * 10));
		 int punteggio = numero;
		 int scelta = 5;
		 System.out.println(numero);
		 
		 do {
			 Scanner input = new Scanner ( System . in );
			 
				System.out.println("Cosa vuoi fare premi 1 per carta altro tasto per sto bene: ");
				scelta = input.nextInt();
				if (scelta == 1) {
					numero = ((int) (Math.random() * 10));
					System.out.println("E' uscito: " + numero);
					
					if (numero > 0 && numero < 8) {
						
						punteggio += numero;
						
					}
					else {
						punteggio += 0.5;
					}
				if (punteggio == 7.5) {
					System.out.println("Hai fatto sette e mezzo");
					scelta = 6;
				}
				else if (punteggio > 7.5) {
					System.out.println("Hai sballato");
					scelta = 6;
				}
				System.out.println("Totale: "+ punteggio);
				
				}
		 }	
			while (scelta == 1);
		 
		 System.out.println("Hai fatto " + punteggio);
				
		 }

	      
	}