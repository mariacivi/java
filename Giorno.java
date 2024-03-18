import java . util . Scanner ;
public class Giorno {
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
System . out . println ( " Inserisci un numero [1 -7] " );
int giorno = input . nextInt ();
if ( giorno ==1) System . out . println ( " Lunedi " );
else if ( giorno ==2) System . out . println ( " Martedi " );
else if ( giorno ==3) System . out . println ( " Mercoledi " );
else if ( giorno ==4) System . out . println ( " Giovedi " );
else if ( giorno ==5) System . out . println ( " Venerdi " );
else if ( giorno ==6) System . out . println ( " Sabato " );
else if ( giorno ==7) System . out . println ( " Domenica " );
else System . out . println ( " Numero errato " );
}
}