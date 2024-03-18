
public class Stampa {

	public static void main(String[] args) {
System . out . println ( " Vuoi continuare ? [ S / N ] " );
// legge il primo carattere della prossima parola
char scelta = input . next (). charAt (0);
switch ( scelta ) {
case ’S ’: System . out . println ( " continua " ); break ;
case ’N ’: System . out . println ( " basta " ); break ;
default : System . out . println ( " ERRORE " );
}
	}
}
