import java . util . Scanner ;
public class Media { // soluzione che usa un array
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
int [] valori = new int [10];
// memorizza tutti i valori in un array
for ( int i =0; i <10; i ++)
valori [ i ] = input . nextInt ();
// somma tutti gli elementi dell ’ array
int somma = 0;
for ( int x : valori ) somma += x ;
// calcola e stampa la media
int media = somma /10;
System . out . println ( " La media e ’: " + media );
}
}