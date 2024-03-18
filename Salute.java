import java . util . Scanner ;
public class Salute {
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
System . out . println ( " Inserisci il la temperatura corporea " );
double febbre = input . nextDouble ();
System . out . println ( " Inserisci i battiti cardiaci al minuto " );
int battito = input . nextInt ();
boolean febbreNo , febbreBassa , febbreAlta ;
boolean battitoOK , battitoAccelerato ;
febbreNo = febbre <37.0;
febbreBassa = ( febbre >=37)&&( febbre <38);
febbreAlta = febbre >=38;
battitoOK = battito <80;
battitoAccelerato = battito >=80;
if ( febbreNo && battitoOK )
System . out . println ( " Tutto OK " );
else if (( febbreBassa && battitoAccelerato )||( febbreAlta ))
System . out . println ( " Stato febbrile " );
else
System . out . println ( " Stato febbrile lieve " );
}
}