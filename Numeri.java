import java.util.Scanner;
public class Numeri {

	public static void main(String[] args) {

	Scanner input = new Scanner (System.in);
	System.out.println("Inserisci un numero:");
	int num1 = input.nextInt();
	System.out.println("Inserisci un secondo numero:");
	int num2 = input.nextInt();
	System.out.println("Inserisci un terzo numero:");
	int num3 = input.nextInt();
if (num1> num2 && num1>num3) System.out.println(num1 + " è maggiore");
else if (num2> num3 && num2>num1) System.out.println(num2 + " è maggiore");
else if (num3> num2 && num3>num1) System.out.println(num3 + " è maggiore");

	
	}
}
