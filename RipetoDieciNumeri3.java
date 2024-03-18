import java . util . Scanner ;
public class RipetoDieciNumeri3 {
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
// array usato per memorizzare i 10 numeri
int [] numeri = new int [10];
System . out . println ( " Inserisci 10 numeri interi " );
for ( int i =0; i <10; i ++) {
numeri [ i ] = input . nextInt ();
}
System . out . println ( " Risultato " );
for ( int n : numeri ) {
System . out . println ( n );
}
}
}