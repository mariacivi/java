import java . util . Random ; // importa la classe di libreria
public class ArrayCasuale {
public static void main ( String [] args ) {
int [] numeri = generaArray (10);
System . out . println ( sommaTutti ( numeri ));
// alternativa : System . out . println ( sommaTutti ( generaArray (10)));
}
private static int [] generaArray ( int n ) {
int [] ris = new int [ n ]; // crea l ’ array da restituire
Random rng = new Random (); // oggetto " random number generator "
for ( int i =0; i < n ; i ++)
ris [ i ] = rng . nextInt (100); // genera gli elementi
return ris ;
}
private static int sommaTutti ( int [] a ) {
int somma = 0;
for ( int x : a ) somma += x ;
return somma ;
}
}