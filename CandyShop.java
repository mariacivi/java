import java . util . Scanner ;
public class CandyShop {
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
int caramelle =100; // caramelle in magazzino
final double PREZZO =0.5; // prezzo singola caramella in euro
while ( caramelle >0) { // fintanto che non ho esaurito le caramelle
System . out . print ( " Sono disponibili " );
System . out . print ( caramelle );
System . out . println ( " caramelle " );
System . out . println ( " Quante ne vuoi comprare ? " );
int num = input . nextInt ();
if ( num <0) // controlla l ’ input
System . out . println ( " Numero errato " );
else {
if ( num > caramelle ) {
num = caramelle ;
System . out . println ( " Hai chiesto troppe caramelle " );
System . out . print ( " Te ne daro ’ soltanto " );
System . out . println ( num );
}
caramelle -= num ; // preleva le caramelle dal magazzino
System . out . print ( " Costo : " );
System . out . print ( num * PREZZO );
System . out . println ( " euro " );
}
}
// a questo punto il ciclo e ’ terminato
// cioe ’ le caramelle sono esaurite ( caramelle <=0)
System . out . println ( " CARAMELLE TERMINATE ! " );
}
}