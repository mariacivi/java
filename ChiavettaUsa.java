


import java.util.ArrayList;

 import java.util.Scanner;
public class ChiavettaUsa {
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 
			Scanner input = new Scanner (System.in);
	 
			Chiavetta c1 = new Chiavetta(10000); 		
			Chiavetta c2 = new Chiavetta(20000);
			Chiavetta c3 = new Chiavetta(30000);
	 
			c1.versamento(30);		
			c2.prelievo(1000);
	 
			ArrayList <Chiavetta> lista = new ArrayList<>();
			lista.add(c1);
			lista.add(c2);
			lista.add(c3);
	 
			System.out.println("Inserisci numero chiavetta: ");
			int numeroChiavetta = input.nextInt();
	 
	 
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getNumero() == numeroChiavetta) {
					System.out.println("Cosa vuoi fare? Premi 1 per comprare, 2 per ricaricare");
					int selezione2 = input.nextInt();
					if (selezione2 == 2) {
						System.out.println("Inserisci l'importo da ricaricare");
						int ricarica = input.nextInt();
						lista.get(i).ricarica(ricarica);
						System.out.println("Ora il tuo saldo è " + lista.get(i).getSaldo() + " euro");
					}
					else if (selezione2 == 1) {
					System.out.println("Cosa vuoi comprare? Premi 1 per caffè, 2 per the, 3 per acqua");				
					int selezione = input.nextInt();
					if (selezione ==1) {
						lista.get(i).caffe(selezione);
						System.out.println("Hai selezionato il caffè!");
						System.out.println("Ora il tuo saldo è " + lista.get(i).getSaldo() + " euro");
					}
					else if (selezione == 2) {
						lista.get(i).the(selezione);
						System.out.println("Hai selezionato il thè!");
						System.out.println("Ora il tuo saldo è " + lista.get(i).getSaldo() + " euro");
					}
					else if (selezione == 3) {
						lista.get(i).acqua(selezione);
					System.out.println("Hai selezionato l'acqua!");
					System.out.println("Ora il tuo saldo è " + lista.get(i).getSaldo() + " euro");
					}
					else { System.out.println("Prodotto non disponibile");
					 
				}
					}
					}
	
		}
	 
	}
}