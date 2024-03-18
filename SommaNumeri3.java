import java . util . Scanner ;
public class SommaNumeri3 {
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
int somma =0; // variabile da usare come accumulatore
int n ; // variabile che memorizza i numeri inseriti
/* NOTA : n deve essere dichiarata qui per
essere visibile nella guardia del while */
do {
System . out . println ( " Inserisci il prossimo numero " );
n = input . nextInt ();
if (n >=0) somma += n ; // aggiorna l ’ accumulatore se n >=0
} while (n >=0); // cicla fintanto che n non e ’ negativo
System . out . println ( somma );
}
}