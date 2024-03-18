import java . util . Scanner ;
public class Giorno {
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
System . out . println ( " Inserisci un numero [1 -7] " );
int giorno = input . nextInt ();
switch ( giorno ) {
case 1: System . out . println ( " Lunedi " ); break ;
case 2: System . out . println ( " Martedi " ); break ;
case 3: System . out . println ( " Mercoledi " ); break ;
case 4: System . out . println ( " Giovedi " ); break ;
case 5: System . out . println ( " Venerdi " ); break ;
case 6: System . out . println ( " Sabato " ); break ;
case 7: System . out . println ( " Domenica " ); break ;
default : System . out . println ( " Numero errato " );
}
}
}
