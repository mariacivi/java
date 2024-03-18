import java . util . Scanner ;
public class Orario4 {
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
int ore , minuti ;
System . out . println ( " Inserire ore e minuti : " );
ore = input . nextInt ();
minuti = input . nextInt ();
boolean ore_ok = ( ore >=0) && ( ore <24);
boolean minuti_ok = ( minuti >=0) && ( minuti <60);
if ( ore_ok && minuti_ok )
System . out . println ( " E ’ un orario " );
else
System . out . println ( " Non e ’ un orario " );
}
}
