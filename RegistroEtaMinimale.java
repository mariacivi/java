// NOTA : cosi ’ importo tutte le classi del package java . io
import java . io .*;
import java . util . Scanner ;
import java . util . Vector ;
public class RegistroEtaMinimale {
public static void main ( String [] args ) {
// memorizza nomi ed eta in due vettori " paralleli ": al nome
// in posizione i corrisponde l ’ eta ’ in posizione i
Vector < String > nomi = new Vector < String >();
Vector < Integer > eta = new Vector < Integer >();
try {
// crea lo stream ( formattato ) di input
Scanner file_input =
new Scanner ( new BufferedReader (
new FileReader ( " registro . txt " )));
// legge tutto il file , aggiungendo i valori letti ai vettori
while ( file_input . hasNext ()) {
// nota : nome deve essere una singola parola ( usa next )
nomi . add ( file_input . next ());
eta . add ( file_input . nextInt ());
}
//chiude lo stream
file_input . close ();
}
catch ( IOException e ) { // in caso di errori ...
System . out . println ( " ERRORE di I / O " );
System . out . println ( e );
}
// stampa il contenuto del registro ( i vettori )
System . out . println ( " REGISTRO DELLE ETA ’" );
for ( int i =0; i < nomi . size (); i ++) {
System . out . println ( nomi . get ( i ) + " " + eta . get ( i ));
}
System . out . println ();
//consente di incrementare ( di uno ) l ’ eta ’ di alcune
//persone nel registro
boolean finito = false ;
do {
//legge un nome
Scanner input = new Scanner ( System . in );
System . out . println ( " Inserisci un nome per incrementare l ’ eta " );
System . out . println ( " oppure invio per terminare : " );
String n = input . nextLine ();
//se l ’ utente ha premuto invio si ferma
if ( n . equals ( " " )) finito = true ;
else {
//altrimenti incrementa l ’ eta ’ corrisp . al nome ( se presente )
int j = nomi . indexOf ( n );
if ( j == -1)
System . out . println ( " Nome " + n + " non presente nel registro " );
else {
int e = eta . get ( j );
eta . set (j , e +1);
System . out . println ( " Ora " + n + " ha " + ( e +1) + " anni " );
}
}
} while (! finito );
//quando l ’ utente ha terminato , salva tutto nel file
try {
//crea lo stream ( formattato ) di output
PrintWriter file_output =
new PrintWriter ( new BufferedWriter (
new FileWriter ( " registro . txt " )));
//scrive i valori usando println
for ( int i =0; i < nomi . size (); i ++) {
file_output . println ( nomi . get ( i ) + " " + eta . get ( i ));
}
//chiude lo stream di output
file_output . close ();
}
catch ( IOException e ) { // in caso di errori ...
System . out . println ( " ERRORE di I / O " );
System . out . println ( e );
}
}
}