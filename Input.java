import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);
	System.out.println("Inserisci un numero:");
	int num1 = input.nextInt();
	
	System.out.println("Inserisci un numero:");
	int num2 = input.nextInt();

	
	System.out.println(num1 + num2);
	}

}
