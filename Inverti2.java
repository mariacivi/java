import java . util . Scanner ;
public class Inverti2 { // soluzione che NON usa un secondo array
public static void main ( String [] args ) {
int [] valori = { 5 , 7 , 9 , 11 , 23 , 8 };
// scorre l ’ array dall ’ ultimo elemento al primo
// notare l ’ uso degli indici nel ciclo for
for ( int i =( valori . length -1); i >=0; i --)
System . out . println ( valori [ i ]);
}
}