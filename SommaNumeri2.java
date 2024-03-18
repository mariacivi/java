import java . util . Scanner ;
public class SommaNumeri2 {
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
System . out . println ( " Quanti numeri vuoi sommare ? " );
int numeri = input . nextInt ();
int cont =0; // variabile da usare come contatore
int somma =0; // variabile da usare come accumulatore
while ( cont < numeri ) { // fintanto che cont e ’ minore di numeri
System . out . println ( " Inserisci il prossimo numero " );
int n = input . nextInt ();
somma += n ; // aggiorna l ’ accumulatore ( con +=)
cont ++; // incrementa il contatore ( con ++)
}
System . out . println ( somma );
}
}