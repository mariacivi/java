import java . util . Scanner ;
public class Inverti { // soluzione che usa un secondo array
public static void main ( String [] args ) {
int [] valori = { 5 , 7 , 9 , 11 , 23 , 8 };
int last = valori . length -1; // posizione dell ’ ultimo elemento
// creo un nuovo array in cui copio i valori in ordine inverso
int [] valori2 = new int [ valori . length ];
for ( int i =0; i < valori . length ; i ++)
valori2 [ i ] = valori [ last - i ];
// stampa il contenuto del secondo array
for ( int x : valori2 )
System . out . println ( x );
}
}
