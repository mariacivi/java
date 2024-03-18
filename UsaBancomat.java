import java.util.Scanner;
import java.io.*;
public class UsaBancomat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner (System.in);
        int num = (int) (Math.random() * 1000);
        ContoCorrente c1 = new ContoCorrente(10000, num); 
        Bancomat b1 = new Bancomat();
		b1.addConto(c1);
        int num1 = (int) (Math.random() * 1000);
        if (num != num1) {
        ContoCorrente c2 = new ContoCorrente(30000, num1); 
        b1.addConto(c2);
        
        }
		
		
		
		
		int numero = 5;
		int scelta = 5;
		
		do {
			scelta = input.nextInt();
			if (scelta != 0) {
			if (scelta == 1) {
			System.out.println("Il numero del conto: ");
			numero = input.nextInt();
			System.out.println("Quanto vuoi prelevare: ");
			int importo = input.nextInt();
			b1.preleva(numero, importo);}
			else if (scelta == 2) {
				System.out.println("Il numero del conto: ");
				numero = input.nextInt();
				System.out.println("Quanto vuoi versare: ");
				int importo = input.nextInt();
				b1.versamento(numero, importo);}
				else if (scelta == 3) {
					System.out.println("Quanto vuoi versare in apertura: ");
				int importo = input.nextInt();
				boolean ok = false;
				int num2 = (int) (Math.random() * 1000);
				
				for (int i = 0; i < b1.lista.size(); i++) {
					if (b1.lista.get(i).numero == num2) {
						ok = true;
					}
						
				}
				if (ok) {
					System.out.println("Operazione non effetuata!...RIprovare");
				}
				else {
				b1.addConto(new ContoCorrente(importo, num2));}
				}
				else if (scelta == 4) {
					try {
						Scanner input1 = new Scanner (System.in);
						System.out.println("Scrivi il nome con cui vuoi salvare: ");
						String nomeFile = input1.nextLine();
						// notare le classi degli stream di byte
						ObjectOutputStream out =
						new ObjectOutputStream ( new BufferedOutputStream (
						new FileOutputStream (nomeFile + ".dat" )));
						out . writeObject ( b1 );
						out . close ();
						} catch ( IOException e) {
						System . out . println (" ERRORE di I/O");
						System . out . println (e );
						}
				}
				else if (scelta == 5) {
					try {
						Scanner input1 = new Scanner (System.in);
						System.out.println("Scrivi il nome del file che vuoi importare");
						String nomeFile = input1.nextLine();
						// notare le classi degli stream di byte
						ObjectInputStream in =
						new ObjectInputStream ( new BufferedInputStream (
						new FileInputStream (nomeFile + ".dat" )));
						b1 = (Bancomat) in . readObject ();
						in . close ();
						} catch ( ClassNotFoundException e) {
						// se il file non contiene un oggetto ....
						System . out . println (" PROBLEMA ( manca oggetto nel file )");
						System . out . println (e );
						} catch ( IOException e) {
						System . out . println (" ERRORE di I/O");
						System . out . println (e );
						}
				
				
			}}}
			
		
		while(scelta != 0);
		b1.stampa();
	}

}