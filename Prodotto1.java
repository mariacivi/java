public class Prodotto1{
 
	public String descrizione;
	public double prezzo;
	public int quantità = 0;
 
	public Prodotto1 (String descrizione, double prezzo, int quantità) {
 
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.quantità = quantità;
 
	}
 
	public void rifornisci (int valore) {
		quantità += valore;
	}
 
	public Boolean vendi () {
		if (this.quantità > 0) {
			quantità -= 1;
			System.out.println("Il prodotto " + descrizione + " costa " + prezzo + " euro.");
			return true;
		} else {
			return false;
		}
	}
}
 