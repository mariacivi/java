import java.util.Scanner;
public class Conversione {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double capitale =100000;
		final double tasso =0.05;
		double interesse ;
		// calcola l ’ interesse maturato dopo un anno
		interesse = capitale * tasso ;
		capitale = capitale + interesse ;
		// calcola l ’ interesse maturato dopo due anni
		interesse = capitale * tasso ;
		capitale = capitale + interesse ;
		// calcola l ’ interesse maturato dopo tre anni
		interesse = capitale * tasso ;
		capitale = capitale + interesse ;
		// stampa il risultato
		System . out . print ( " Capitale maturato : " );
		System . out . println ( capitale );
		
	}

}
