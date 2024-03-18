import java.util.Scanner;
public class AreaCerchio {

	public static void main(String[] args) {
		final double pigreco = 3.14;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci il raggio:");
		int num1 = input.nextInt();
		System.out.println("L'area del cerchio è = " + (num1 *num1 *pigreco));
	}

}
