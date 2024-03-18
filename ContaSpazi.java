import java . util . Scanner ;
public class ContaSpazi {
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
System . out . println ( " Inserisci una riga di testo " );
String s = input . nextLine ();
int cont =0; // contatore degli spazi
int i = s . indexOf ( ’ ’ ); // indice usato per scandire il testo
if ( i != -1) cont ++;
while ( i != -1) {
// cerca il prossimo spazio a partire dalla posizione i +1
i = s . indexOf ( ’ ’ ,i +1);
if ( i != -1) cont ++;
}
System . out . println ( cont );
}
}