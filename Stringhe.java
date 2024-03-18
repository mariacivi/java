import java.util.Scanner;


public class Stringhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String parola = "hello";
		String parola1 = new String("hello1");
		
		System.out.println(parola.indexOf('e'));
		System.out.println(parola.length());
		
		char car = 'p';
		
		Scanner input = new Scanner ( System . in );
		System.out.println("Scrivi una parola: ");
		String word = input.nextLine();
		System.out.println("Scrivi una parola: ");
		String word1 = input.nextLine();
		
		if (word.equalsIgnoreCase(word1)) {
			System.out.println("Sono uguali ");
		}
		else {
			System.out.println("Sono diverse ");
		}
		
		
		
		
	}

}