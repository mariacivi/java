import java.util.Scanner;
public class ExcUguali {
	public static void main ( String [] args ) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci un numero:");
		int num1 = input.nextInt();
		System.out.println("Inserisci un secondo numero:");
		int num2 = input.nextInt();
if (num1 == num2) {
	System.out.println("I due numeri sono uguali");
}else System.out.println("I due numeri sono diversi");
}
}