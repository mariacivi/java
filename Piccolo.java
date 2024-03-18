import java.util.Scanner;
public class Piccolo {

		public static void main(String[] args) {
			
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci un numero:");
		int num1 = input.nextInt();
		if (num1>=0 && num1<= 100 && num1 % 2==0)System.out.println("Il numero è pari e piccolo");
		else System.out.println("Il numero non è pari e non è piccolo");
		
		
		}
		
}