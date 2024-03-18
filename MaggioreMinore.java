import java.util.Scanner;
public class MaggioreMinore {

	public static void main(String[] args) {

	Scanner input = new Scanner (System.in);
	System.out.println("Inserisci un numero:");
	int num1 = input.nextInt();
	System.out.println("Inserisci un secondo numero:");
	int num2 = input.nextInt();
	System.out.println("Inserisci un terzo numero:");
	int num3 = input.nextInt();
	
	if (num1 > num2 && num2 > num3) System.out.println(num1 +""+ num2 +""+ num3);
	else if (num1 > num3 && num3 > num2) System.out.println("Numeri in ordine crescente:" +num3+" "+ num1+" "+ num2);
	else if (num2 > num1 && num1 > num3) System.out.println("Numeri in ordine crescente:" +num3+" "+ num1+" "+ num2);
	else if (num2 > num3 && num3 > num1) System.out.println("Numeri in ordine crescente:" +num1+" "+ num3+" "+ num2);
	else if (num3 > num1 && num1 > num3) System.out.println("Numeri in ordine crescente:" +num1+ " "+ num2+" "+num3);
	else if (num3 > num1 && num1 > num3)System.out.println("Numeri in ordine crescente: " + num2+  " " + num1+ " " +num3);
	}
}