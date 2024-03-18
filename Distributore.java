package Corso;
import java.util.ArrayList;
 
public class Distributore {
 
	ArrayList<Chiavetta> chiavette;
 
	public Distributore () {
		chiavette = new ArrayList<Chiavetta> ();
	}
 
	public void erogaCaffè (int numero) {
 
		boolean ok = false;
 
		for (int i =0; i < chiavette.size(); i++) {
			if (numero == chiavette.get(i).getID()) {
				if (chiavette.get(i).prelievo(2)) {
					ok = true;
				}
			}
		}
 
		if (!ok) {
			System.out.println ("La chiavetta non esiste!");
		}
		else {
			System.out.println("Caffè erogato.");
		}		
	}
 
	public void erogaTè (int numero) {
		boolean ok = false;
 
		for (int i =0; i < chiavette.size(); i++) {
			if (numero == chiavette.get(i).getID()) {
				if (chiavette.get(i).prelievo(3)) {
					ok = true;
				}
			}
		}
 
		if (!ok) {
			System.out.println ("La chiavetta non esiste!");
		}
		else {
			System.out.println("Tè erogato.");
		}
 
	}
 
	public void erogaAcqua (int numero) {
		boolean ok = false;
 
		for (int i =0; i < chiavette.size(); i++) {
			if (numero == chiavette.get(i).getID()) {
				if (chiavette.get(i).prelievo(1)) {
					ok = true;
				}
			}
		}
 
		if (!ok) {
			System.out.println ("La chiavetta non esiste!");
		}
		else {
			System.out.println("Acqua erogata");
		}
 
	}
 
	public void ricaricaChiavetta (int numero, int importo) {
		boolean ok = false;
 
		for (int i =0; i < chiavette.size(); i++) {
			if (numero == chiavette.get(i).getID()) {
				if (chiavette.get(i).versamento(importo)) {
					ok = true;
				}
			}
		}
 
		if (!ok) {
			System.out.println ("La chiavetta non esiste!");
		}
		else {
			System.out.println("Ricarica effettuata correttamente");
		}
	}
 
 
	public void mostraSaldo (int numero) {
		for (int i = 0; i < chiavette.size(); i++) {
			if (numero == chiavette.get(i).getID()) {
				System.out.println("Il saldo è: " + chiavette.get(i).getSaldo());
			}	
		}
 
 
	}
}