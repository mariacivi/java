import java.util.Scanner;
import java.util.ArrayList;
 
public class prenotaLibri2 {
 
	public static void main(String[] args) {
		Libri libro1 = new Libri("Una vita degna di essere vissuta", "Marsha Linehan");
		Libri libro2 = new Libri("Il poema dell'hashish", "Charles Baudelaire");
		Libri libro3 = new Libri("Il segreto di Medusa", "Hannah Lynn");
		Libri libro4 = new Libri("Il viaggio della tartaruga", "Carl Safina");
 
		Scanner scan = new Scanner(System.in);
		int scelta = 0;
		ArrayList<Libri> listaLibri = new ArrayList<Libri>();
		listaLibri.add(libro1);
		listaLibri.add(libro2);
		listaLibri.add(libro3);
		listaLibri.add(libro4);
 
		do {
			System.out.println("Scegli un libro: 1, 2, 3 o 4");
			int sceltaLibro = scan.nextInt();
			System.out.println("Scegli 5 per cambiare stato, 6 per renderlo non disponibile e 8 per uscire.");
			scelta = scan.nextInt();
			if (scelta == 8) {
				break;
			} else {
					if (scelta == 5) {
						listaLibri.get(sceltaLibro-1).setStato();
						System.out.println(listaLibri.get(sceltaLibro-1) + "\n");
					} else if (scelta == 6) {
						listaLibri.get(sceltaLibro-1).setLibro();
						System.out.println(listaLibri.get(sceltaLibro-1) + "\n");
					}
 
			}
 
		} while (scelta != 8);
 
		System.out.println("Modifiche effettuate, torna presto.");
 
	}
 
}