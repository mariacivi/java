import java . util . Scanner ;
public class Saldo {
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
double saldo ;
// chiedo il saldo del conto corrente
System . out . println ( " Inserisci il saldo del tuo conto " );
saldo = input . nextDouble ();
if ( saldo >=0) // se il saldo e ’ positivo
System . out . println ( " Il saldo e ’ positivo ! " );
else // altrimenti
System . out . println ( " Il saldo e ’ negativo ! " );
System . out . println ( " Grazie per aver usato il nostro servizio " );
}
}