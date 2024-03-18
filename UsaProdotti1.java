import prodotti.Prodotto;
import prodotti.ProdottoScontabile;

public class UsaProdotti1 {
 
	public static void main(String[] args) {
 
		Prodotto biscotti = new Prodotto("Biscotti al cioccolato", 2.50, 15);
 
		biscotti.vendi();
		System.out.println("La quantità di " + biscotti.descrizione + " è di " + biscotti.quantità + " unità.");
 
		ProdottoScontabile thè = new ProdottoScontabile("Thè verde", 5.50, 30, 5, 10);
 
		thè.vendi(26);
		System.out.println("Hai risparmiato " + ((thè.prezzo*26) * 10/100) + " euro.");
 
 
 
		System.out.println(thè.vendi(5));
 
 
 
	}
 
}