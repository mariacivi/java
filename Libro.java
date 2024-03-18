public class Libro {
	private String stato;
	public String titolo;
	public String autore;
 
 
 
	public Libro (String titolo,String autore) {
		this.titolo=titolo;
		this.autore=autore;
		this.stato="Disponibile";
	}
	public void setstato() {
		if (stato.equals("Disponibile")){
			System.out.println("Il libro " + titolo+ " " + "scritto da " +autore + " " +"è stato prenotato correttamente! ");
			stato="In prestito";
		}
		else if (stato.equals("In prestito")){
			System.out.println("Non puoi prenotare questo libro!");
			System.out.println("Il libro " + titolo+ " " + "scritto da " +autore + " " +"è attualmente: " +stato);
	} else {
		System.out.println("Non puoi prenotarlo non è disponibile!");
	}
		}
		public String toString() {
			return ("Libro: " + titolo + " " + "autore: " + autore + " " + "stato:" + stato);
 
	}
		public void eliminaLibro () {
			 this.stato="Non disponibile";
			}
		}
 
