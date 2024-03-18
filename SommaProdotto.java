import java.util.Scanner;
public class SommaProdotto {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Inserisci il primo numero =");
		int num1 = input.nextInt();
		System.out.println("Inserisci il secondo numero =");
		int num2 = input.nextInt();
		System.out.println("La somma è =" +(num1 + num2) );
		System.out.println("Il prodotto è =  " +(num1*num2));
	}

}
