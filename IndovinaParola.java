import java . util . Scanner ;
public class IndovinaParola {
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
String parolaMisteriosa = " ciao " ;
int tentativi =0; // contatore dei tentativi
boolean indovinato = false ; // " flag " che dice quando terminare
do {
String s = input . next ();
if ( s . equals ( parolaMisteriosa )) {
System . out . println ( " INDOVINATO !!! " );
indovinato = true ; // interrompe il ciclo
} else {
System . out . println ( " Sbagliato ... " );
tentativi ++;
if ( parolaMisteriosa . compareTo ( s ) <0)
System . out . println ( " La parola misteriosa precede " + s );
else
System . out . println ( " La parola misteriosa segue " + s );
}
} while (! indovinato && tentativi <10); // due condizioni di uscita
// verifica il motivo dell ’ uscita dal ciclo
if (! indovinato ) System . out . println ( " Tentativi esauriti " );
}
}