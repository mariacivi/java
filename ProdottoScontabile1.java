import prodotti.Prodotto;

public class ProdottoScontabile1 extends Prodotto {
 
	public int prodVenduti;
	public int sconto;
	public double prezzoTotale;
 
	public ProdottoScontabile1(String descrizione, double prezzo, int quantità, int prodVenduti, int sconto ) {
 
		super(descrizione, prezzo, quantità);
 
		this.prodVenduti = prodVenduti;
		this.sconto = sconto;
	}
 
	public Boolean vendi (int somma) {
		if (quantità >= somma) {
 
			if (somma >= prodVenduti) {
				quantità -= somma;
				prezzoTotale = (prezzo*somma) - ((prezzo*somma) *sconto /100);
				System.out.println("Il prodotto " + descrizione + " comprato " + somma + " volte" + " viene scontato del " + sconto + "%" + " per un prezzo totale di: " + prezzoTotale + " euro.");
			} else {
				this.quantità =- somma;
				prezzoTotale = prezzo*somma;
				System.out.println("Il prodotto " + descrizione + " comprato " + somma + " volte " + " ha un prezzo totale di: " + prezzoTotale + " euro.");
			}
 
			return true;
 
		} else {
			return false;
		}
	}
}