import java.util.Scanner;
public class MInutiInOre {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci un numero:");
		int num1 = input.nextInt(); 
		
		double orario = (double) num1/60;
		int ore = (int) orario;
		int num1 = (orario-ore)*60;
		System.out.println("Corrispondono a "+ ore + "ore e " + (int) num1 + "minuti");
	}

}
