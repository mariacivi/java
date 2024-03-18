import java.util.ArrayList;
import java.util.Scanner;

public class UsaContoCorrente {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// TODO Auto-generated method stub
        
		ContoCorrente c1 = new ContoCorrente(10000); 
		
		ContoCorrente c2 = new ContoCorrente(30000);
		//c1.versa(1000);
		//c1.preleva(30000);
		/*System.out.println("Il saldo è "+ c1.getSaldo());
		System.out.println("Il conto è "+ c1.getNumero());
		System.out.println("Il saldo è "+ c2.getSaldo());
		System.out.println("Il conto è "+ c2.getNumero());*/
		
		//ContoCorrente.tasso = 3;
		
		//chiamamo il metodo calcolaInteressi
		// c1.calcolaInteressi();
	
		
		//ContoCorrente.saldo = 20000;
		
		ArrayList <ContoCorrente> bancomat = new ArrayList<>();
		bancomat.add(c1);
		bancomat.add(c2);
		
		System.out.println("Inserisci numero: ");
		int numconto = input.nextInt();
		
		for (int i = 0; i < bancomat.size(); i++) {
			if (bancomat.get(i).getNumero() == numconto) {
				System.out.println("Quanto vuoi prelevare: ");
				
				int prel = input.nextInt();
				bancomat.get(i).preleva(prel);
				
				System.out.println(bancomat.get(i));
				
			}
		}
		
		
		
		
		// invochiamo il metodo toString sull'oggetto
		System.out.println(c1);
		System.out.println(c2);
		
	}

}