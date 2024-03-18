import java . util . Scanner ;
public class SommaProdottoDieci {
// metodo principale
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
System . out . println ( " Inserisci 1 per la somma , 2 per il prodotto " );
int scelta = input . nextInt ();
if ( scelta ==1) {
int risultato = somma10 (); // chiamata del metodo somma10
System . out . println ( risultato );
}
else if ( scelta ==2) {
int risultato = prodotto10 (); // chiamata del metodo prodotto10
System . out . println ( risultato );
}
else System . out . println ( " ERRORE " );
}
// metodo ausiliario che calcola la somma da 1 a 10
private static int somma10 () {
int ris =0;
for ( int i =1; i <=10; i ++)
ris += i ;
return ris ;
}// metodo ausiliario che calcola il prodotto da 1 a 10
private static int prodotto10 () {
int ris =1;
for ( int i =1; i <=10; i ++)
ris *= i ;
return ris ;
}
} // FINE CLASSE