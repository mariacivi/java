import java . util . Scanner ;
public class Media2 { // soluzione che NON usa un array
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
// somma on - the - fly tutti gli elementi inseriti
int somma = 0;
for ( int i =0; i <10; i ++)
somma += input . nextInt ();
// calcola e stampa la media
int media = somma /10;
System . out . println ( " La media e ’: " + media );
}
}