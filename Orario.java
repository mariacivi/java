import java . util . Scanner ;
public class Orario {
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
int ore , minuti ;
System . out . println ( " Inserire ore e minuti : " );
ore = input . nextInt ();
minuti = input . nextInt ();
if ( ore <0)
System . out . println ( " Non e ’ un orario " );
else if ( ore >23)
System . out . println ( " Non e ’ un orario " );
else if ( minuti <0)
System . out . println ( " Non e ’ un orario " );
else if ( minuti >59)
System . out . println ( " Non e ’ un orario " );
else
System . out . println ( " E ’ un orario " );
}
}