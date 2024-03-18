import java . io . FileReader ;
import java . io . FileWriter ;
import java . io . IOException ;
public class CopiaFile {
public static void main ( String [] args ) {
// questo non serve ... lo uso solo per calcolare
// il tempo di esecuzione del programma
long inizio = System . currentTimeMillis ();
try {
int next ;
// crea entrambi gli stream ( input e output )
FileReader reader = new FileReader ( " prova . txt " );
FileWriter writer = new FileWriter ( " prova2 . txt " );
do {
// legge un carattere dallo stream di input ...
next = reader . read ();
if ( next != -1) {
char c = ( char ) next ;
// e lo scrive nello stream di output ...
writer . write ( c );
}
} while ( next != -1); // finche ’ il file non finisce
// chiude entrambi gli stream
reader . close ();
writer . close (); // provare a commentare questo !!
}
catch ( IOException e ) { // in caso di errori ...
System . out . println ( " ERRORE di I / O " );
System . out . println ( e );
}
// quanto tempo ha impiegato ?
// ( anche questo in realta ’ non serve ...)
long fine = System . currentTimeMillis ();
System . out . println ( " Impiegati " +( fine - inizio )+ " millisecondi " );
}
}