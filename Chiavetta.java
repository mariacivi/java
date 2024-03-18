
public class Chiavetta {
 
	public int saldo = 20;
	public int numero;
	public static int numeroIdentificativo = 100;
 
	public Chiavetta(int saldo) {
 
		 this.saldo = saldo;
		 this.numero = numero;
		 this.numeroIdentificativo++;
		 this.numero = numeroIdentificativo;
	}
 
		 public boolean versamento(int somma) {
			 if (somma > 2 && somma < 50) {
				 this.saldo += somma;
				 System.out.println("Sono stati versati " + somma + " euro.");
				 System.out.println("Il saldo della chiavetta adesso è uguale a " + saldo + " euro.");
			 } else { 
				 System.out.println("Somma non consentita: Inserire un valore tra 2 e 50 euro.");
				 }
			return false;
		 }
 
		 public boolean prelievo(int somma) {			 
			 if(somma <= this.saldo) {			 
				 this.saldo -= somma;
				 System.out.println("Sono stati prelevati " + somma + " euro.");
				 System.out.println("Il saldo della chiavetta adesso è uguale a " + saldo + " euro.");
		 }	 else {
				 System.out.println("Somma non disponibile");
			 }
			return false;
 
		 }
 
		 public void caffe(int somma) {
			 this.saldo -= 2;
		 }
 
		 public void the(int somma) {
			 this.saldo -= 3;
		 }
 
		 public void acqua(int somma) {
			 this.saldo -= 1;
		 }
 
		 public void ricarica(int somma) {
			 this.saldo += somma;
		 }
 
		 public int getSaldo() {
			 return saldo;
		 }
		 public int getNumero() {
			 return numero;
		 }
		 public String toString() {			 
			 return "Il saldo della chiavetta numero " + this.numero + " è " + this.saldo + " euro";
		 }

		public int getID() {
			// TODO Auto-generated method stub
			return 0;
		}
	 }
 
 