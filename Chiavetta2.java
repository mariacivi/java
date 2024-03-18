package Corso;
 
public class Chiavetta2 {
 
	private static int idGenerale = 100;
 
	private int id; 
	private int saldo;
 
	public Chiavetta2 () {
		idGenerale++;
		id = idGenerale;
		saldo = 20;
	}
 
	public boolean versa (int somma) {
		//min 2 euro max 50 euro
		if (somma >= 2 || somma <= 50) {
			this.saldo = this.saldo + somma;
			System.out.println ("Hai ricaricato di " + somma + " Euro. Il nuovo saldo è " + saldo);
			return true;
		}
		else {
			System.out.println ("Importo non corretto. Devi inserire da 2 a 50 Euro");
			return false;
		}
 
	}
 
	public boolean preleva (int somma) {
		if (somma <= this.saldo) {
			this.saldo = saldo - somma;
			System.out.println ("Hai prelevato " + somma + " Euro. Il nuovo saldo è " + saldo);
			return true;
		}
		else {
			System.out.println ("Importo non disponibile");
			return false;
		}
	}
 
	public int getID () {
		return this.id;
	}
 
	public int getSaldo () {
		return this.saldo;
	}
 
}