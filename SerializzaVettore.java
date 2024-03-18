import java . io .*;
import java . util . Vector ;
public class SerializzaVettore {
public static void main ( String [] args ) {
// crea e inizializza un vettore
Vector < String > v1 = new Vector < String >();
v1 . add ( " AAA " );
v1 . add ( " BBB " );
v1 . add ( " CCC " );
// lo salva in un file
try {
// notare le classi degli stream di byte
ObjectOutputStream out =
new ObjectOutputStream ( new BufferedOutputStream (
new FileOutputStream ( " serializza . dat " )));
out . writeObject ( v1 );
out . close ();
} catch ( IOException e ) {
System . out . println ( " ERRORE di I / O " );
System . out . println ( e );
}
//lo rilegge dal file ( assegnandolo a un altra variabile )
Vector < String > v2 = null ;
try {
//notare le classi degli stream di byte
ObjectInputStream in =
new ObjectInputStream ( new BufferedInputStream (
new FileInputStream ( " serializza . dat " )));
v2 = ( Vector < String >) in . readObject ();
in . close ();
} catch ( C la ss N ot FoundException e ) {
//se il file non contiene un oggetto ....
System . out . println ( " PROBLEMA ( manca oggetto nel file ) " );
System . out . println ( e );
} catch ( IOException e ) {
System . out . println ( " ERRORE di I / O " );
System . out . println ( e );
}
//stampa quanto letto dal file
System . out . println ( v2 );
}
}
