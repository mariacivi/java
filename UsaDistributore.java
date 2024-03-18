

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;


/* La classe implementa l'interfaccia Serializable, che include funzionalità per serializzare automaticamente i dati.
   E' utilizzata quando abbiamo bisogno di salvare oggetti su file esterni. 
   La serializzazione trasforma un oggetto in un formato che può essere più facilmente memorizzato e trasmesso. 
   La deserializzazione lo riporta allo stato di oggetto per renderlo di nuovo leggibile da Java.
*/
public class UsaDistributore implements Serializable {
	

	static Scanner input = new Scanner(System.in);
	
	// imposta il nome del file in cui salvare i dati del distributore
	private static final String FILE_PATH = "distributore.ser";
	
	public static void main(String[] args) throws InterruptedException {
		
		/* Crea un oggetto, ma invece di assegnargli direttamente new Distributore,
		   chiama prima il metodo caricaDistributore. Questo verifica se esiste già
		   l'oggetto all'interno di un file archiviato, ed in tal caso lo carica.
		   Se l'oggetto non è ancora stato creato (cioè siamo al primo avvio del programma)
		   allora lo crea con new Distributore. 
		*/
	    Distributore distributore = caricaDistributore();

	    
	    /* Tutta l'esecuzione è messa dentro un blocco try. Questo perchè se qualcosa dovesse
	       andare storto il programma non crasha. Anzi,l'errore viene 'catturato' impostando 
	       un'eccezione con uno specifico messaggio di errore.
	    */
		try {
			int scelta = 0;
			int currentID = 0;
			boolean accesso = false;
	
		
			System.out.println("Benvenuto!!!\n");
			
			
			/* Finchè non viene effettuato l'accesso con un id valido, stampa il menù iniziale.
			*/
			while(!accesso) {	
				
				// blocco try-catch per il menù iniziale
				try {
					System.out.print("Digita 1 per inserire il tuo ID, 2 per creare un nuovo ID: ");
					scelta = input.nextInt();
					
					// sezione per inserire un id esistente
					if (scelta == 1) {
						System.out.print("\nInserisci il tuo ID: ");
						currentID = input.nextInt();
						
						if (distributore.checkID(currentID)) {
							System.out.println("\nChiavetta valida.\n");
							accesso = true;
						} else {
							System.out.println("Chiavetta non riconosciuta.\n");
						}
						
					// sezione per creare un nuovo id
					} else if (scelta == 2) {
						int newID = distributore.creaChiavetta();
						System.out.println("\n\nChiavetta generata correttamente. Il tuo ID è: " + newID + "\n\n");
					}
					
				// gestisce, con un'eccezione specifica, il caso in cui viene digitato un tasto non previsto
				} catch (InputMismatchException e) {
					System.out.println("Inserito un valore non valido.\n\n");
					input.nextLine(); // serve a svuotare il buffer dai caratteri digitati e rimasti sospesi
				}	
				
			} // chiude il while del menù iniziale 

			
			
			/* L'accesso è avvenuto correttamente e stampiamo il menù principale	
			 */
			if (accesso) {
				
				do {
					// blocco try-catch per il do-while
					try {
						System.out.print(
										  "1. Caffè - euro 1.00\n"
										+ "2. The   - euro 2.00\n"
										+ "3. Acqua - euro 1.00\n"
										+ "7. Visualizza saldo\n"
										+ "8. Ricarica chiavetta\n"
										+ "9. Esci\n"
										+ "\nLa tua scelta: "
										);
						scelta = input.nextInt();
						
						
						switch(scelta) {
						
							case 1:
								distributore.erogaCaffè(currentID);
								System.out.println("\n\nSto erogando il caffè\n");
								Thread.sleep(500);
								System.out.println("...");
								Thread.sleep(500);
								System.out.println("......");
								Thread.sleep(500);
								System.out.println(".........");
								Thread.sleep(1000);
								System.out.println("\nErogazione effettuata.\n\n");
								Thread.sleep(1000);
								break;
								
							case 2:
								distributore.erogaThe(currentID);
								System.out.println("\n\nSto erogando il the\n");
								Thread.sleep(500);
								System.out.println("...");
								Thread.sleep(500);
								System.out.println("......");
								Thread.sleep(500);
								System.out.println(".........");
								Thread.sleep(1000);
								System.out.println("\nErogazione effettuata.\n\n");
								Thread.sleep(1000);
								break;
								
							case 3:
								distributore.erogaAcqua(currentID);
								System.out.println("\n\nSto erogando l'acqua\n");
								Thread.sleep(500);
								System.out.println("...");
								Thread.sleep(500);
								System.out.println("......");
								Thread.sleep(500);
								System.out.println(".........");
								Thread.sleep(1000);
								System.out.println("\nErogazione effettuata.\n\n");
								Thread.sleep(1000);
								break;
							
							case 7:
								System.out.println("\n\nIl tuo saldo è di euro " +
												  distributore.visualizzaSaldo(currentID) + "\n\n");
								Thread.sleep(1000);
								break;
													
							case 8:
								System.out.print("\n\nInserisci la banconota: ");
								try{
									int importo = input.nextInt();
									distributore.ricaricaChiavetta(currentID, importo);
									System.out.println("Ricarica effettuata correttamente.");
									System.out.println("Nuovo saldo: euro " + distributore.visualizzaSaldo(currentID) + "\n\n");
								} catch (Exception e) {
									System.out.println("Banconota non riconosciuta\n\n");
									Thread.sleep(1000);
								}
								break;
									
							case 9:
								System.out.println("\n\nArrivederci e grazie!");
								break;
								
							default:
								System.out.println("\nScelta non valida.\n\n");
								Thread.sleep(1000);
						} //chiude switch
						
						
					// come nel try-catch del primo menù, gestisce l'eccezione di input non valido	
					} catch (InputMismatchException e) {
						System.out.println("Inserito un valore non valido.\n\n");
						input.nextLine(); // serve a svuotare il buffer dai caratteri digitati e rimasti sospesi
					}
					
				} while (scelta != 9);  //chiude do-while del menù principale
				
			} // chiude il blocco if che esegue se accesso è true	
					
			
		// cattura un'eccezione generica del blocco try-catch esterno
		} catch (Exception e) {
			System.out.println("Si è verificato un errore.n\n");
		
			
		// il finally si usa quando vogliamo che un'istruzione venga eseguita in ogni caso, anche se il try non va a buon fine.
		// in questo caso lo usiamo per garantirci che lo stato del distributore venga salvato e non si perdano gli ultimi dati.
		} finally {
			salvaDistributore(distributore);
			input.close(); // Chiude lo scanner
		}
	}
	
	
	
	/* metodo per prelevare l'oggetto distributore dal file, ad inizio esecuzione
	   restituisce un oggetto di tipo Distributore.
	*/
    private static Distributore caricaDistributore() {
        Distributore distributore = null; // inizializza un oggetto vuoto
        
        /* Questo tipo di blocco try si chiama try-with-resources. 
           Serve a garantire che tutte le risorse dichiarate all'interno delle parentesi tonde 
           vengano chiuse automaticamente a fine blocco, anche in caso non vada a buon fine.
           Il finally può fare una cosa simile, ma in quel caso le istruzioni di chiusura delle
           risorse aperte vanno inseriti manualmente e sono automatiche.
        */
        try (FileInputStream fileIn = new FileInputStream(FILE_PATH); // preleva il file con i dati del distributore
             ObjectInputStream in = new ObjectInputStream(fileIn)) {  // crea uno stream per leggere i dati del file
        	
        	// legge un oggetto di tipo indefinito dallo stream e lo converte (con un cast forzato) a Distributore
            distributore = (Distributore) in.readObject();
            System.out.println("Distributore caricato.\n");
            
            
        /* Qui il catch gestisce due tipi di eccezioni diverse (input/output e classe non trovata). 
           Creerà un oggetto nuovo da zero invece di prelevarlo dal file.
        */
        } catch (IOException | ClassNotFoundException e) {
            distributore = new Distributore();
            System.out.println("Nessun file trovato. Creazione di un nuovo distributore.\n\n");
        }
        
        return distributore; // restituisce l'oggetto (recuperato o ricreato)
    }
    
    
    
    /* metodo per salvare l'oggetto distributore su file, a fine esecuzione
	   è di tipo void perchè non deve restituire nulla, l'oggetto viene solo salvato su file.
	*/
    private static void salvaDistributore(Distributore distributore) {
    	
    	/* qui il try-with-resources gestisce apertura e chiusura dello stream per il flusso di output
    	   e del file su cui viene salvato il flusso.
    	 */
        try (FileOutputStream fileOut = new FileOutputStream(FILE_PATH);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
        	
        	// scrive l'oggetto distributore nell'oggetto stream, che verrà serializzato.
            out.writeObject(distributore);
            System.out.println("\n\nDistributore salvato.");
        
        // stampa un messaggio definito da noi + il codice di errore generato dall'eccezione 'e'
        } catch (IOException e) {
            System.out.println("Errore durante il salvataggio del distributore: " + e.getMessage());
        }
    }
}
			