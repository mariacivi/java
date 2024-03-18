import java . io . FileReader ;
import java . io . IOException ;
public class LeggiFile {
public static void main ( String [] args ) {
try {
int next ;
// crea lo stream di input
FileReader reader = new FileReader ( " prova . txt " );
do {
// legge i caratteri
next = reader . read ();
if ( next != -1) {
// casta l ’ intero a char e lo visualizza
char c = ( char ) next ;
System . out . print ( c );
}
} while ( next != -1); // finche il file non finisce
// chiude lo stream
reader . close ();
}
catch ( IOException e ) {
// in caso di errori in una delle operazioni ...
System . out . println ( " ERRORE di I / O " );
System . out . println ( e );
}
}
}